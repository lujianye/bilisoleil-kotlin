package com.yoyiyi.soleil.network.helper

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * *
 * @date 创建时间：2017/5/10 10:23
 * * 描述:okHttp 帮助类
 */

import android.content.Context
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.yoyiyi.soleil.network.support.ApiConstants
import com.yoyiyi.soleil.utils.AppUtils
import com.yoyiyi.soleil.utils.FileUtils
import com.yoyiyi.soleil.utils.NetworkUtils
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

/**
 * 全局统一使用的OkHttpClient工具，okhttp版本：okhttp3
 */
class OkHttpHelper private constructor() {

    companion object {
        //读取时间
        const val DEFAULT_READ_TIMEOUT_MILLIS = (20 * 1000).toLong()
        //写入时间
        const val DEFAULT_WRITE_TIMEOUT_MILLIS = (20 * 1000).toLong()
        //超时时间
        const val DEFAULT_CONNECT_TIMEOUT_MILLIS = (20 * 1000).toLong()
        //最大缓存
        const private val HTTP_RESPONSE_DISK_CACHE_MAX_SIZE = (20 * 1024 * 1024).toLong()//设置20M
        //长缓存有效期为7天
        const val CACHE_STALE_LONG = 60 * 60 * 24 * 7
        @Volatile var okHttpClient: OkHttpClient = null!!

        lateinit var okHttpHelper: OkHttpHelper//单例模式
    }

    init {
        val loggingInterceptor = HttpLoggingInterceptor()
        //var okHttpClient: OkHttpClient
        //包含header、body数据
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        okHttpClient = OkHttpClient.Builder()
                .readTimeout(DEFAULT_READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_WRITE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                .connectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                .cache(getCache(AppUtils.getAppContext()))//设置缓存
                // 失败重发
                .retryOnConnectionFailure(true)
                //设置缓存
                .addNetworkInterceptor(RewriteCacheControlInterceptor())
                .addInterceptor(RewriteCacheControlInterceptor())
                //FaceBook 网络调试器，可在Chrome调试网络请求，查看SharePreferences,数据库等
                .addNetworkInterceptor(StethoInterceptor())
                //http数据log，日志中打印出HTTP请求&响应数据
                .addInterceptor(loggingInterceptor)
                //便于查看json
                // .addInterceptor(new LoggerInterceptor())
                .addInterceptor(UserAgentInterceptor())
                .build()
    }

    fun getOkHttpClient(): OkHttpClient = okHttpClient


    /**
     * 设置缓存路径

     * @param context 上下文
     */
    fun setCache(context: Context) {
        val baseDir = context.applicationContext.cacheDir
        if (baseDir != null) {
            val cacheDir = File(baseDir, "CopyCache")
            okHttpClient!!.newBuilder().cache(Cache(cacheDir, HTTP_RESPONSE_DISK_CACHE_MAX_SIZE))
        }
    }


    /**
     * 获取缓存路径

     * @return cache
     */
    fun getCache(context: Context): Cache {
        var cache: Cache? = null
        val path = FileUtils.createRootPath(context)
        val baseDir = File(path)
        if (baseDir != null) {
            val cacheDir = File(baseDir, "CopyCache")
            cache = Cache(cacheDir, HTTP_RESPONSE_DISK_CACHE_MAX_SIZE)
        }
        return cache!!
    }


    /**
     * 添加UA拦截器，B站请求API需要加上UA才能正常使用
     */
    private class UserAgentInterceptor : Interceptor {
        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain?): Response {
            val originalRequest = chain!!.request()
            val requestWithUserAgent = originalRequest.newBuilder()
                    .removeHeader("User-Agent")
                    .addHeader("User-Agent", ApiConstants.COMMON_UA_STR)
                    .build()
            return chain!!.proceed(requestWithUserAgent)
        }
    }

    private class RewriteCacheControlInterceptor : Interceptor {
        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain?): Response {
            var request = chain!!.request()
            if (!NetworkUtils.isConnected(AppUtils.getAppContext())) {
                request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build()
            }
            val originalResponse = chain.proceed(request)
            if (NetworkUtils.isConnected(AppUtils.getAppContext())) {
                //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
                val cacheControl = request.cacheControl().toString()
                return originalResponse.newBuilder().header("Cache-Control", cacheControl)
                        .removeHeader("Pragma").build()
            } else {
                return originalResponse.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + CACHE_STALE_LONG)
                        .removeHeader("Pragma").build()
            }
        }
    }
}
