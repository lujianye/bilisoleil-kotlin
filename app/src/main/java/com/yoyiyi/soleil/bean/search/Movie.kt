package com.yoyiyi.soleil.bean.search

/**
 * @author zzq  作者 E-mail:   soleilyoyiyi@gmail.com
 * *
 * @date 创建时间：2017/6/19 13:06
 * * 描述:
 */

data class Movie(var code: Int,
                 var data: DataBean,
                 var message: String,
                 var ttl: Int) {

    /**
     * code : 0
     * data : {"trackid":"5366355170602595779","pages":6,"items":[{"title":"女王","cover":"https://i0.hdslb.com/bfs/bangumi/7cf444b192492ac55dca5ba44e858e1dce614a81.jpg","uri":"bilibili://video/4605417","param":"4605417","goto":"av","started":0,"total_count":0,"desc":"1997年，戴安娜王妃车祸身亡，举国悲痛欲绝，但是英国王室人员却对此采取了逃避疏离的态度。这种漠不关心激怒了很多英国民众。民众反王室的情绪相当高涨，紧急形势让王室陷入了严重的危机。但是，英王伊丽沙白（海伦\u2022米伦Helen Mirren 饰）并没有出来稳定民心，而是携家人躲到了度假行宫。托尼\u2022布莱尔（麦克\u2022辛 Michael Sheen 饰）此时刚出任首相，面对此刻棘手的情势，必须尽快找到平衡各方利益的措施，让王室摆脱信任危机，女王重新修好与国民的关系，而自己也在当中树立权威。","screen_date":"2006-09-15 08:00:00","area":"法国,英国,意大利","cover_mark":"免费观看","actors":"海伦·米伦、麦克·辛、詹姆斯·克伦威尔、阿历克斯·杰宁斯、安吉拉·兰斯伯瑞","staff":"导演：斯蒂芬·弗雷斯\n编剧：皮特·摩根","length":103,"status":2,"attentions":0},{"title":"留级之王2","cover":"https://i0.hdslb.com/bfs/bangumi/6951d420873bc41084b33b280139d223bbcdca42.jpg","uri":"bilibili://video/3034493","param":"3034493","goto":"av","started":0,"total_count":0,"desc":"泰吉\u2022巴德兰德巴德（卡尔\u2022潘 Kal Penn 饰）带着范\u2022维尔德的精神和大学学位，远赴英国加尔福德大学\u2014\u2014这里是他父亲曾经\u201c战斗\u201d过的地方，兄弟会\u201c狐狸与猎犬\u201d之屋留下了父亲风光的记忆，然而来这里担任助教的泰吉并不被对方认可，狐狸与猎犬的首脑皮普反而将泰吉戏弄了一通。泰吉来到自己负责的宿舍\u2014\u2014被戏称为马厩的败落小屋，这里住着四个边缘化的学生：研究量子物理和男女关系的盖辛，暴躁的爱尔兰人谢莫斯，沉默的宅男赛门以及不检点的女生赛迪。泰吉为了让这几位问题青年重新振作，自组鸡公牛社团向皮普的狐狸与猎犬之屋发起挑战，而皮普的女友查莉令泰吉一见钟情，于是一场关乎学生尊严和助教爱情的奋战拉开了序幕\u2026\u2026","screen_date":"2006-12-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"卡尔·潘、Lauren Cohan、Daniel Percival、格伦·巴里","staff":"导演：Mort Nathan\n编剧：David Drew Gallagher","length":96,"status":2,"attentions":0},{"title":"鬼片王之再现凶榜","cover":"https://i0.hdslb.com/bfs/bangumi/aea638908e68c87aeac7a9f8d455820085d75e5a.jpg","uri":"bilibili://video/3954640","param":"3954640","goto":"av","started":0,"total_count":0,"desc":"暑假到了，寄宿学校只留下总监Miss郑（张文慈饰）和四个学生愤祥（雷宇扬饰）、小丑（黄小莺饰）、Nokia（袁伟豪饰）及123（施念慈饰）。自从校工福婶（彭丹饰）的孙女离奇死亡，被弃置於冰箱内；而且福婶的小狗被割去头颅，一名转校生Connie（陈思颖饰）来到，连串怪事陆续发生。调查此案的于Sir（王敏德饰）险遇交通意外。Connie养父（李兆基饰）得悉一切时，便告之他们Connie是魔鬼的女儿，众人不信，反责他妖言惑众。","screen_date":"1999-11-18 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"王敏德、雷宇扬、张文慈","staff":"导演：刘孝伟\n编剧：张荣耀、刘孝伟","length":84,"status":2,"attentions":0},{"title":"冒险王","cover":"https://i0.hdslb.com/bfs/bangumi/e7524e17d478db73bc8c63856ce2e26111c8a63e.jpg","uri":"bilibili://video/5075431","param":"5075431","goto":"av","started":0,"total_count":0,"desc":"电视剧编剧周世杰（李连杰）被妻子莫尼卡（关之琳）闹离婚，郁闷之下开始编写剧集《冒险王》的剧本，想象中他成了民国时代的冒险王卫亦信，莫妮卡变作日本特务美加子，藉此宣泄郁闷。\n唐三藏当年西天取得、今下落不明的无字真经成为中国及日本政府争抢的目标，为免日本人捷足先登，中国政府邀请考古专家卫亦信及其徒弟包教晓（金城武）追查真经下落，得知线索在经盒表面，两人混入日本领事馆，结识身份神秘的美女美加子，后两人又追线索到某日报社，从编辑英叔（罗家英）口中知晓经盒下落，但消息亦被美加子得知。","screen_date":"1996-02-10 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"李连杰、关之琳、金城武、杨采妮、罗家英","staff":"导演：程小东\n编剧：林伟伦、绍丽琼","length":90,"status":2,"attentions":0},{"title":"王者之剑","cover":"https://i0.hdslb.com/bfs/bangumi/a742b92832d66b0c123bd96ebddcf653273abb30.jpg","uri":"bilibili://video/4046810","param":"4046810","goto":"av","started":0,"total_count":0,"desc":"本片根据1932年罗伯特·霍华德的漫画《剑上的凤凰》改编而成，是《蛮王柯南》三部曲的第一部。\n在地球蛮荒时期，一切以武力来解决争斗。远古大陆上，两支兵强马壮的部落军队正在进行厮杀，而其中有一位勇敢的战士率领自己的部落获得了战争的胜利，他就是蛮王柯南（杰森·莫玛 Jason Momoa 饰）。得胜归来的柯南受到了部落的爱戴，他诛杀可怕的怪物，为部落开拓疆土，但一场阴谋正在谋划当中\u2026\u2026\n超自然的邪恶势力正意图侵蚀柯南的部落，它控制部落里的心腹，整个部落惨遭屠杀，连柯南的父亲科灵（朗·普尔曼 Ron Perlman 饰）也未能幸免。意外活下来的柯南，将穿越西伯利亚冰原寻找盟友的帮助，他身负血海深仇，将用最原始、最野蛮的方式，为自己的父亲和同族报仇\u2026\u2026","screen_date":"2011-08-19 08:00:00","area":"美国","cover_mark":"免费观看","actors":"杰森·莫玛、朗·普尔曼、罗丝·麦高恩、史蒂芬·朗、瑞秋·尼科尔斯、萨伊德·塔格马奥","staff":"导演： 马库斯·尼斯佩尔\n编剧： 托马斯·迪恩·唐纳利、约书亚·奥本海默","length":108,"status":2,"attentions":0},{"title":"查理的王国","cover":"https://i0.hdslb.com/bfs/bangumi/00d06fbe4683b21f2ff3da08b392335f43e7de34.jpg","uri":"bilibili://video/2651164","param":"2651164","goto":"av","started":0,"total_count":0,"desc":"黑人查理感到手足无措。在他遥远的王国里，白人法律的干涉令他感到生活变得更加困难了。于是查理下定决定，要按照古老的方式生活，但是他这样的做法给他和周围的人带来了一系列意想不到的后果。","screen_date":"2013-10-12 08:00:00","area":"澳大利亚","cover_mark":"免费观看","actors":"大卫·古皮利、卢克·福特、博亚娜·诺瓦科维奇、加里·思韦特、Peter Djigirr、Bobby Bunungurr、Frances Djulibing、Jennifer Budukpuduk Gaykamangu、Peter Minygululu、Ritchie Singer、Garry Waddell、J.B. Williams","staff":"导演：洛夫·德·希尔\n编剧：洛夫·德·希尔、大卫·古皮利","length":107,"status":2,"attentions":0},{"title":"拳王阿里","cover":"https://i0.hdslb.com/bfs/bangumi/4634cd0ecc7c953ff751f5743ca0715847656df9.jpg","uri":"bilibili://video/4241254","param":"4241254","goto":"av","started":0,"total_count":0,"desc":"1964年，年轻的阿里（Will Smith 威尔\u2022 史密斯 饰）凭着高超的拳术，坚韧的毅力战胜尼桑\u2022里斯顿成为了新的拳王！时值越南战争期间，阿里拒绝服兵役，因为\u201c越共没有管我叫黑鬼\u201d。正因为阿里直率的性格，拒绝向自己认为错误的事屈服，阿里因此吃尽苦头：美国政府用尽方法企图将阿里投进监狱；拳击理事会剥夺了阿里拳王的金腰带，等等。\n在1964至1974这社会动荡的10年里，阿里表现出的坚忍不拔的毅力和决不屈服的独立性不仅对他个人，对拳击界甚至对整个社会都产生了巨大的回响，阿里亦因此成为黑人运动和反越战运动的精神领袖。\n最终在1974年，阿里凭着过人的毅力，以34岁的运动高龄，再次向拳王发出了挑战！","screen_date":"2001-12-25 08:00:00","area":"美国","cover_mark":"免费观看","actors":"威尔·史密斯、杰米·福克斯、强·沃特、马里奥·范·皮布尔斯、罗恩·西维尔、杰弗里·怀特、贾达·萍克·史密斯、麦凯尔泰·威廉逊、诺娜·加耶、迈克尔·米歇尔","staff":"导演： 迈克尔·曼\n编剧： 史蒂芬·里维尔、Christopher Wilkinson、艾瑞克·罗斯、迈克尔·曼","length":157,"status":2,"attentions":0},{"title":"河王","cover":"https://i0.hdslb.com/bfs/bangumi/5ea5e6a17f471b74059a39954b6d4220bb8c0bf5.jpg","uri":"bilibili://video/3865817","param":"3865817","goto":"av","started":0,"total_count":0,"desc":"Abel去调查当地一间\u2018高档\u2019学校里一个男孩的死亡事件, 他尸体在河上被发现。学校高层恐惧会引起丑闻，坚持这只是一宗普通的自杀案。但Abel从男孩的女友处得知,他常常被人家欺负, Abel 怀疑一个危险的学生入会仪式搞砸了，于是他秘密地请求一位有同情心的老师Betsy来帮忙。可Abel的上司警告他别再调查下去, 因为学校赞助警察慈善资金不少款项。Abel, 不能就此罢手, 不仅因为几年前他的兄弟自杀了, 而且男孩的鬼魂好像给他们留下了线索，解释当晚到底发生了什么事情。","screen_date":"2005-10-21 08:00:00","area":"英国,加拿大","cover_mark":"免费观看","actors":"Edward Burns、Jennifer Ehle","staff":"导演： Nick Willing\n编剧： 大卫·凯恩","length":99,"status":2,"attentions":0},{"title":"地狱魔王","cover":"https://i0.hdslb.com/bfs/bangumi/e299bc902d0c281d1057160b7831229e63f50afe.jpg","uri":"bilibili://video/8475188","param":"8475188","goto":"av","started":0,"total_count":0,"desc":"一位考古学家不慎打开了一处封印，地狱魔王被放了出来。虽沉睡多年，但是地狱魔王仍在慢慢地积聚力量，现在他要开始统治整个世界的计划了。他首先在附近的小镇上制造了多起自杀事件。勇敢的记者凯尔（柯宾·伯恩森 饰）负责调查这案件，他发现了有关地狱魔王的可怕真相。现在他和几名幸存者要凭着仅有的几件武器把地狱魔王及其爪牙送回封印的地方。\n这几乎是一个不可能完成的任务。但是整个世界的安危都系于他们身上！","screen_date":"2011-01-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"柯宾·伯恩森、Raw Leiba、唐·詹尼斯","staff":"导演：Robert Stock\n编剧：Robert Stock","length":91,"status":2,"attentions":0},{"title":"赌王千霸之胜者为王","cover":"https://i0.hdslb.com/bfs/bangumi/c69257f53de69076b000d88881629af96be3307b.jpg","uri":"bilibili://video/5344012","param":"5344012","goto":"av","started":0,"total_count":0,"desc":"阿浩与阿劲是一对共患难的好兄弟，兄弟二人为黑社会老大黑哥以赌为生。当阿劲的孩子出世后，他便不想过卖命赌钱的日子了，他想给妻子和儿子一个安定的家，平平安安地过日子。此时阿浩也遇到了自己心爱的姑娘阿莲，兄弟二人决心洗心革面，不再为他人卖命。谁知，他们的动机被黑哥的伙同龙哥看出，他们便不则手段对付阿劲和阿浩，想控制他们继续为其卖命。","screen_date":"2001-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"孙国明、陈国邦","staff":"导演：彭俊伟\n编剧：蔡春燕","length":87,"status":2,"attentions":0},{"title":"极速枪王","cover":"https://i0.hdslb.com/bfs/bangumi/fb09dfe1e388a6d79108fd618600d8ff35cd18b0.jpg","uri":"bilibili://video/3954519","param":"3954519","goto":"av","started":0,"total_count":0,"desc":"四少年枪王，誓破无情宿命。保方、碧咸、奥云破了\u201c枪神\u201d案后，在警队中被封为\u201c破案三剑侠\u201d。总督察黎SIR再次召集三人，参与一项保护内政要女儿阿雪来港参展的任务，三人起初不以为然，后来却发现，在阿雪的背后隐藏着重大阴谋\u2026\u2026","screen_date":"2001-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"陈国邦、黎耀祥、罗兰、梁焯满","staff":"导演：刘孝伟\n编剧：刘孝伟","length":87,"status":2,"attentions":0},{"title":"拳王","cover":"https://i0.hdslb.com/bfs/bangumi/fdff76bdc73e3ac7cacf4886064b56f2fb007985.jpg","uri":"bilibili://video/5415163","param":"5415163","goto":"av","started":0,"total_count":0,"desc":"沉默寡言的师兄阿明一向沉迷拳击，但他在一次胸有成竹的比赛中惨被击倒后，决心到泰国学艺，当地严格的训练不单改造拳手的体能，更能升拳手的尊严和擂台上无惧的精神。阿德自少随父学习国术，但有感中国武术在擂台不能尽展所长，故此便上拳馆苦练泰拳，企图扩阔搏击艺术的包容性和宽容度。","screen_date":"1991-11-10 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"吕颂贤、林敬刚、杜少津、刘玉翠 ","staff":"导演：刘国昌\n编剧：陈文强、冼锦青 ","length":104,"status":2,"attentions":0},{"title":"铁路之王","cover":"https://i0.hdslb.com/bfs/bangumi/9bb3703717f231e27ec2ac4b9ae415ab74879e64.jpg","uri":"bilibili://video/3868079","param":"3868079","goto":"av","started":0,"total_count":0,"desc":"一个不负责任的大学预科生Preston West被怀疑为了一笔可观的遗产杀害了他的父母。所以他逃跑试图寻找到真正的凶手：13号\u201c幽灵\u201d，一个疯狂的火车装卸游民。Preston开着货车，遇见了不怀好意的铁路工人，恶毒的铁路警察，隐藏的无业游民，神秘的女人，臭名昭著的Baron和他形形色色的游民帮。在一个出乎意料的结局中，他终于面对第13号\u201c幽灵\u201d。","screen_date":"2005-01-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"Ernest Borgnine、W.M. Comartin、Bobb Hopkins | See full cast & crew ","staff":"导演： Bobb Hopkins\n编剧： Bobb Hopkins","length":92,"status":2,"attentions":0},{"title":"城市王子","cover":"https://i0.hdslb.com/bfs/bangumi/a7ab0215f76261a6ae96939eeac6da92011a219f.jpg","uri":"bilibili://video/8475181","param":"8475181","goto":"av","started":0,"total_count":0,"desc":"王子拉，他的养子马来西亚的亿万富翁jaggoi锡布延，更使他比纯种的儿子太子锡布延是家庭的骄傲。当Dana公...","screen_date":"2012-01-01 08:00:00","area":"马来西亚","cover_mark":"免费观看","actors":"Julian Cheah、迈克尔·马德森","staff":"导演：Roslan Hussin \n编剧：Roslan Hussin ","length":83,"status":2,"attentions":0},{"title":"胡桃夹子：魔境冒险","cover":"https://i0.hdslb.com/bfs/bangumi/4d77bf510f295c3ad54e39246ab7ad53b9056111.jpg","uri":"bilibili://video/3954607","param":"3954607","goto":"av","started":0,"total_count":0,"desc":"九岁的小女孩玛丽（艾丽·范宁 Elle Fanning 饰）拥有锦衣玉食的生活，却缺乏父母的陪伴。圣诞节前夜，玛丽收到了叔叔送来的一份珍贵礼物\u2014\u2014一个装木偶的小房子和一只胡桃夹子。喜出望外的玛丽将胡桃夹子视作自己的知心伙伴，竟意外地发现它会说话，并声称自己名叫NC（查理·罗 Charlie Rowe 饰），是玩具王国的王子，然而在一场噩梦中，美好的王国被凶残的鼠王（约翰·特托罗 John Turturro 饰）占领了，他还将王子变成一只木偶永远驱逐出境，只有找到真正相信童话的人才能解除咒语。在雪仙子（朱莉娅·维斯托斯卡亚 Yuliya Vysotskaya 饰）的指引下，玛丽帮NC恢复了肉身，并勇敢地答应与他一起回王国打败鼠王，解放子民。然而，这两个毫无武力只有一颗纯真之心的孩子，能否对抗整支血腥残暴的老鼠大军和卑鄙狡猾的鼠王呢？\n片中歌曲多数改编自柴可夫斯基的交响乐，其中一部分来自芭蕾舞剧《胡桃夹子》。","screen_date":"2010-11-24 08:00:00","area":"英国","cover_mark":"免费观看","actors":"艾丽·范宁、内森·连恩、约翰·特托罗、查理·罗、弗朗西斯·德·拉·图瓦","staff":"导演：安德烈·康查洛夫斯基\n编剧：安德烈·康查洛夫斯基、Chris Solimine","length":108,"status":2,"attentions":0},{"title":"冰球坏小子","cover":"https://i0.hdslb.com/bfs/bangumi/2565d1fbcbab86a5aab19bc6c15d55140380dfa8.jpg","uri":"bilibili://video/3034374","param":"3034374","goto":"av","started":0,"total_count":0,"desc":"酒吧保安道格·格拉特（西恩·威廉·斯科特 Seann William Scott 饰）体格强壮，行事略有呆气，在一次观看冰球比赛时将不满观众嘘声的球员痛揍，他的壮举经好友拍摄公布后引起大众注意，阴差阳错加入当地一支冰球队从头学起，充当队中暴徒角色。一场场血战为道格赢来了知名度，在教练的请托和引荐下，道格进入职业小联盟的刺客队，刺客队中有因为受伤而产生心理阴影的昔日王牌球员泽维尔，而道格的任务，即是保证泽维尔等队友在场上的安全。道格在比赛之外结识了热爱冰球的姑娘伊娃（艾丽森·皮尔 Alison Pill 饰），他向姑娘笨拙的表达着自己的爱慕。另一方面，王牌冰场打手罗斯在前方等待着道格的挑战\u2026\u2026","screen_date":"2011-09-10 08:00:00","area":"美国,加拿大","cover_mark":"免费观看","actors":"西恩·威廉·斯科特、杰伊·巴鲁切尔、马克-安德烈·格隆丁、金·寇兹、艾丽森·皮尔、列维·施瑞博尔、里基·马比","staff":"导演：迈克尔·道斯\n编剧：杰伊·巴鲁切尔、埃文·戈德堡","length":91,"status":2,"attentions":0},{"title":"本X","cover":"https://i0.hdslb.com/bfs/bangumi/a2902b973fd05bf3bd8ae393dd048351f795c3e6.jpg","uri":"bilibili://video/8764697","param":"8764697","goto":"av","started":0,"total_count":0,"desc":"本X是本（格雷格·提姆曼斯 Greg Timmermans 饰）在游戏《霸王》里的名字，游戏里他技压群雄、所向披靡。然而现实中的本却是一个患有自闭症的少年，沉默寡言的他在同学们眼中犹如异类并且受尽那帮同学的欺负和侮辱。本时常幻想着自己就是游戏里面的勇士，可是现实的残酷却将一切幻想纷纷击碎。本游走于现实和游戏的之间，两者的界限逐渐模糊起来。本在游戏中结识一个叫斯嘉莱（劳拉·沃林登 Laura Verlinden 饰）的女孩，女孩用她的真诚和勇气鼓舞着本重拾自我，最终在本的臆想中女孩陪伴他走上了一条\u201c置之死地而后生\u201d的道路\u2026\u2026\n在2007年的第31届蒙特利尔电影节上，本片获得了美洲大奖以及评审团和观众的最高奖。","screen_date":"2007-09-26 08:00:00","area":"比利时,荷兰","cover_mark":"免费观看","actors":"格雷格·提姆曼斯、Laura Verlinden、Pol Goossen","staff":"导演：尼克·巴斯阿扎\n编剧：尼克·巴斯阿扎","length":93,"status":2,"attentions":0},{"title":"一个赌波的传说","cover":"https://i0.hdslb.com/bfs/bangumi/5ef1ad0c73a86ede8ad65a7d0f5449276181aea9.jpg","uri":"bilibili://video/4120650","param":"4120650","goto":"av","started":0,"total_count":0,"desc":"讲波佬钟仔将细鬼因贪念而死在母亲兰寿宴上的故事告诉英超酒吧内各酒客，以警惕他们不要沉迷赌博。可是每天还是有人向他索取，令他极为反感，一次更因不胜其烦乱中押中了一只必败球队，从此被人奉为波神.英超老板车仔因生意不佳而兼职替赌球杂志波经写文章,由于过分投入，其妻波波提出离婚。对足球一窍不通的榕榕，乐乐和芳芳都来凑热闹，不料意外大获全胜。","screen_date":"2003-03-12 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"王喜","staff":"导演： 刘孝伟\n编剧： 吴奕龙、岑智敏","length":93,"status":2,"attentions":0},{"title":"搏击之霸","cover":"https://i0.hdslb.com/bfs/bangumi/db33a6a2ba7614ed95f65981a5406e7db7a74070.jpg","uri":"bilibili://video/3934652","param":"3934652","goto":"av","started":0,"total_count":0,"desc":"罗伟辰又称\u201c拳神\u201d，是泰国华侨，他以快速的拳脚闻名于泰国街头。他已经将拳击看作一种艺术，他听说香港拳术天才成志退出拳击界，并隐居国内，拳神便决定找成志切磋。在国内拳神碰上贪杯的小芬，小芬带他到酒吧，老板洪强的弟弟洪力欺凌酒客，小芬利用拳神为酒客解围。成志常常喝酒麻痹自己，洪力迫成志对付拳神抵偿欠债，并暗设拳击赌赛图利，小芬破坏洪力计划，令洪力损失惨重，拳神向成志讨教，成志不肯，原因是他在拳赛中曾误杀对手，芬妈引发成志出手，成志终于明白，练武已经是赋予拳术生命，拳术已成为自己的生命的一部分，挥不走，甩不掉，洪力绑架小芬又破坏芬妈货仓，拳神被电单车队埋伏，险象环生，成志相助，众人逃生，洪强却找来几个武术高手埋伏，疲惫的拳神，成志只好施展混身解数对敌\u2026\u2026","screen_date":"2005-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"陈治良、林泉、桑伟淋、徐宝华、赵毅","staff":"导演：夏占士\n编剧：廖志强","length":85,"status":2,"attentions":0},{"title":"故事王StoryMan","cover":"https://i0.hdslb.com/bfs/active/9c1ec29c8bb40755bbabf3fcb92675de00765ef6.jpg","uri":"bilibili://splist/71977","param":"71977","goto":"sp","started":0,"total_count":0,"desc":"每一场比赛，参赛选手都将利用随机发放的比赛卡牌，讲出一段或搞笑或动人或悬疑的剧情，而评委们则根据选手们的临场表现进行打分，最终在残酷激烈的淘汰赛后选出能够拯救故事王国的最强故事王。\r\n","status":0,"attentions":0}]}
     * message :
     * ttl : 1
     */


    data class DataBean(var trackid: String,
                        var pages: Int,
                        var items: List<ItemsBean>) {
        /**
         * trackid : 5366355170602595779
         * pages : 6
         * items : [{"title":"女王","cover":"https://i0.hdslb.com/bfs/bangumi/7cf444b192492ac55dca5ba44e858e1dce614a81.jpg","uri":"bilibili://video/4605417","param":"4605417","goto":"av","started":0,"total_count":0,"desc":"1997年，戴安娜王妃车祸身亡，举国悲痛欲绝，但是英国王室人员却对此采取了逃避疏离的态度。这种漠不关心激怒了很多英国民众。民众反王室的情绪相当高涨，紧急形势让王室陷入了严重的危机。但是，英王伊丽沙白（海伦\u2022米伦Helen Mirren 饰）并没有出来稳定民心，而是携家人躲到了度假行宫。托尼\u2022布莱尔（麦克\u2022辛 Michael Sheen 饰）此时刚出任首相，面对此刻棘手的情势，必须尽快找到平衡各方利益的措施，让王室摆脱信任危机，女王重新修好与国民的关系，而自己也在当中树立权威。","screen_date":"2006-09-15 08:00:00","area":"法国,英国,意大利","cover_mark":"免费观看","actors":"海伦·米伦、麦克·辛、詹姆斯·克伦威尔、阿历克斯·杰宁斯、安吉拉·兰斯伯瑞","staff":"导演：斯蒂芬·弗雷斯\n编剧：皮特·摩根","length":103,"status":2,"attentions":0},{"title":"留级之王2","cover":"https://i0.hdslb.com/bfs/bangumi/6951d420873bc41084b33b280139d223bbcdca42.jpg","uri":"bilibili://video/3034493","param":"3034493","goto":"av","started":0,"total_count":0,"desc":"泰吉\u2022巴德兰德巴德（卡尔\u2022潘 Kal Penn 饰）带着范\u2022维尔德的精神和大学学位，远赴英国加尔福德大学\u2014\u2014这里是他父亲曾经\u201c战斗\u201d过的地方，兄弟会\u201c狐狸与猎犬\u201d之屋留下了父亲风光的记忆，然而来这里担任助教的泰吉并不被对方认可，狐狸与猎犬的首脑皮普反而将泰吉戏弄了一通。泰吉来到自己负责的宿舍\u2014\u2014被戏称为马厩的败落小屋，这里住着四个边缘化的学生：研究量子物理和男女关系的盖辛，暴躁的爱尔兰人谢莫斯，沉默的宅男赛门以及不检点的女生赛迪。泰吉为了让这几位问题青年重新振作，自组鸡公牛社团向皮普的狐狸与猎犬之屋发起挑战，而皮普的女友查莉令泰吉一见钟情，于是一场关乎学生尊严和助教爱情的奋战拉开了序幕\u2026\u2026","screen_date":"2006-12-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"卡尔·潘、Lauren Cohan、Daniel Percival、格伦·巴里","staff":"导演：Mort Nathan\n编剧：David Drew Gallagher","length":96,"status":2,"attentions":0},{"title":"鬼片王之再现凶榜","cover":"https://i0.hdslb.com/bfs/bangumi/aea638908e68c87aeac7a9f8d455820085d75e5a.jpg","uri":"bilibili://video/3954640","param":"3954640","goto":"av","started":0,"total_count":0,"desc":"暑假到了，寄宿学校只留下总监Miss郑（张文慈饰）和四个学生愤祥（雷宇扬饰）、小丑（黄小莺饰）、Nokia（袁伟豪饰）及123（施念慈饰）。自从校工福婶（彭丹饰）的孙女离奇死亡，被弃置於冰箱内；而且福婶的小狗被割去头颅，一名转校生Connie（陈思颖饰）来到，连串怪事陆续发生。调查此案的于Sir（王敏德饰）险遇交通意外。Connie养父（李兆基饰）得悉一切时，便告之他们Connie是魔鬼的女儿，众人不信，反责他妖言惑众。","screen_date":"1999-11-18 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"王敏德、雷宇扬、张文慈","staff":"导演：刘孝伟\n编剧：张荣耀、刘孝伟","length":84,"status":2,"attentions":0},{"title":"冒险王","cover":"https://i0.hdslb.com/bfs/bangumi/e7524e17d478db73bc8c63856ce2e26111c8a63e.jpg","uri":"bilibili://video/5075431","param":"5075431","goto":"av","started":0,"total_count":0,"desc":"电视剧编剧周世杰（李连杰）被妻子莫尼卡（关之琳）闹离婚，郁闷之下开始编写剧集《冒险王》的剧本，想象中他成了民国时代的冒险王卫亦信，莫妮卡变作日本特务美加子，藉此宣泄郁闷。\n唐三藏当年西天取得、今下落不明的无字真经成为中国及日本政府争抢的目标，为免日本人捷足先登，中国政府邀请考古专家卫亦信及其徒弟包教晓（金城武）追查真经下落，得知线索在经盒表面，两人混入日本领事馆，结识身份神秘的美女美加子，后两人又追线索到某日报社，从编辑英叔（罗家英）口中知晓经盒下落，但消息亦被美加子得知。","screen_date":"1996-02-10 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"李连杰、关之琳、金城武、杨采妮、罗家英","staff":"导演：程小东\n编剧：林伟伦、绍丽琼","length":90,"status":2,"attentions":0},{"title":"王者之剑","cover":"https://i0.hdslb.com/bfs/bangumi/a742b92832d66b0c123bd96ebddcf653273abb30.jpg","uri":"bilibili://video/4046810","param":"4046810","goto":"av","started":0,"total_count":0,"desc":"本片根据1932年罗伯特·霍华德的漫画《剑上的凤凰》改编而成，是《蛮王柯南》三部曲的第一部。\n在地球蛮荒时期，一切以武力来解决争斗。远古大陆上，两支兵强马壮的部落军队正在进行厮杀，而其中有一位勇敢的战士率领自己的部落获得了战争的胜利，他就是蛮王柯南（杰森·莫玛 Jason Momoa 饰）。得胜归来的柯南受到了部落的爱戴，他诛杀可怕的怪物，为部落开拓疆土，但一场阴谋正在谋划当中\u2026\u2026\n超自然的邪恶势力正意图侵蚀柯南的部落，它控制部落里的心腹，整个部落惨遭屠杀，连柯南的父亲科灵（朗·普尔曼 Ron Perlman 饰）也未能幸免。意外活下来的柯南，将穿越西伯利亚冰原寻找盟友的帮助，他身负血海深仇，将用最原始、最野蛮的方式，为自己的父亲和同族报仇\u2026\u2026","screen_date":"2011-08-19 08:00:00","area":"美国","cover_mark":"免费观看","actors":"杰森·莫玛、朗·普尔曼、罗丝·麦高恩、史蒂芬·朗、瑞秋·尼科尔斯、萨伊德·塔格马奥","staff":"导演： 马库斯·尼斯佩尔\n编剧： 托马斯·迪恩·唐纳利、约书亚·奥本海默","length":108,"status":2,"attentions":0},{"title":"查理的王国","cover":"https://i0.hdslb.com/bfs/bangumi/00d06fbe4683b21f2ff3da08b392335f43e7de34.jpg","uri":"bilibili://video/2651164","param":"2651164","goto":"av","started":0,"total_count":0,"desc":"黑人查理感到手足无措。在他遥远的王国里，白人法律的干涉令他感到生活变得更加困难了。于是查理下定决定，要按照古老的方式生活，但是他这样的做法给他和周围的人带来了一系列意想不到的后果。","screen_date":"2013-10-12 08:00:00","area":"澳大利亚","cover_mark":"免费观看","actors":"大卫·古皮利、卢克·福特、博亚娜·诺瓦科维奇、加里·思韦特、Peter Djigirr、Bobby Bunungurr、Frances Djulibing、Jennifer Budukpuduk Gaykamangu、Peter Minygululu、Ritchie Singer、Garry Waddell、J.B. Williams","staff":"导演：洛夫·德·希尔\n编剧：洛夫·德·希尔、大卫·古皮利","length":107,"status":2,"attentions":0},{"title":"拳王阿里","cover":"https://i0.hdslb.com/bfs/bangumi/4634cd0ecc7c953ff751f5743ca0715847656df9.jpg","uri":"bilibili://video/4241254","param":"4241254","goto":"av","started":0,"total_count":0,"desc":"1964年，年轻的阿里（Will Smith 威尔\u2022 史密斯 饰）凭着高超的拳术，坚韧的毅力战胜尼桑\u2022里斯顿成为了新的拳王！时值越南战争期间，阿里拒绝服兵役，因为\u201c越共没有管我叫黑鬼\u201d。正因为阿里直率的性格，拒绝向自己认为错误的事屈服，阿里因此吃尽苦头：美国政府用尽方法企图将阿里投进监狱；拳击理事会剥夺了阿里拳王的金腰带，等等。\n在1964至1974这社会动荡的10年里，阿里表现出的坚忍不拔的毅力和决不屈服的独立性不仅对他个人，对拳击界甚至对整个社会都产生了巨大的回响，阿里亦因此成为黑人运动和反越战运动的精神领袖。\n最终在1974年，阿里凭着过人的毅力，以34岁的运动高龄，再次向拳王发出了挑战！","screen_date":"2001-12-25 08:00:00","area":"美国","cover_mark":"免费观看","actors":"威尔·史密斯、杰米·福克斯、强·沃特、马里奥·范·皮布尔斯、罗恩·西维尔、杰弗里·怀特、贾达·萍克·史密斯、麦凯尔泰·威廉逊、诺娜·加耶、迈克尔·米歇尔","staff":"导演： 迈克尔·曼\n编剧： 史蒂芬·里维尔、Christopher Wilkinson、艾瑞克·罗斯、迈克尔·曼","length":157,"status":2,"attentions":0},{"title":"河王","cover":"https://i0.hdslb.com/bfs/bangumi/5ea5e6a17f471b74059a39954b6d4220bb8c0bf5.jpg","uri":"bilibili://video/3865817","param":"3865817","goto":"av","started":0,"total_count":0,"desc":"Abel去调查当地一间\u2018高档\u2019学校里一个男孩的死亡事件, 他尸体在河上被发现。学校高层恐惧会引起丑闻，坚持这只是一宗普通的自杀案。但Abel从男孩的女友处得知,他常常被人家欺负, Abel 怀疑一个危险的学生入会仪式搞砸了，于是他秘密地请求一位有同情心的老师Betsy来帮忙。可Abel的上司警告他别再调查下去, 因为学校赞助警察慈善资金不少款项。Abel, 不能就此罢手, 不仅因为几年前他的兄弟自杀了, 而且男孩的鬼魂好像给他们留下了线索，解释当晚到底发生了什么事情。","screen_date":"2005-10-21 08:00:00","area":"英国,加拿大","cover_mark":"免费观看","actors":"Edward Burns、Jennifer Ehle","staff":"导演： Nick Willing\n编剧： 大卫·凯恩","length":99,"status":2,"attentions":0},{"title":"地狱魔王","cover":"https://i0.hdslb.com/bfs/bangumi/e299bc902d0c281d1057160b7831229e63f50afe.jpg","uri":"bilibili://video/8475188","param":"8475188","goto":"av","started":0,"total_count":0,"desc":"一位考古学家不慎打开了一处封印，地狱魔王被放了出来。虽沉睡多年，但是地狱魔王仍在慢慢地积聚力量，现在他要开始统治整个世界的计划了。他首先在附近的小镇上制造了多起自杀事件。勇敢的记者凯尔（柯宾·伯恩森 饰）负责调查这案件，他发现了有关地狱魔王的可怕真相。现在他和几名幸存者要凭着仅有的几件武器把地狱魔王及其爪牙送回封印的地方。\n这几乎是一个不可能完成的任务。但是整个世界的安危都系于他们身上！","screen_date":"2011-01-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"柯宾·伯恩森、Raw Leiba、唐·詹尼斯","staff":"导演：Robert Stock\n编剧：Robert Stock","length":91,"status":2,"attentions":0},{"title":"赌王千霸之胜者为王","cover":"https://i0.hdslb.com/bfs/bangumi/c69257f53de69076b000d88881629af96be3307b.jpg","uri":"bilibili://video/5344012","param":"5344012","goto":"av","started":0,"total_count":0,"desc":"阿浩与阿劲是一对共患难的好兄弟，兄弟二人为黑社会老大黑哥以赌为生。当阿劲的孩子出世后，他便不想过卖命赌钱的日子了，他想给妻子和儿子一个安定的家，平平安安地过日子。此时阿浩也遇到了自己心爱的姑娘阿莲，兄弟二人决心洗心革面，不再为他人卖命。谁知，他们的动机被黑哥的伙同龙哥看出，他们便不则手段对付阿劲和阿浩，想控制他们继续为其卖命。","screen_date":"2001-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"孙国明、陈国邦","staff":"导演：彭俊伟\n编剧：蔡春燕","length":87,"status":2,"attentions":0},{"title":"极速枪王","cover":"https://i0.hdslb.com/bfs/bangumi/fb09dfe1e388a6d79108fd618600d8ff35cd18b0.jpg","uri":"bilibili://video/3954519","param":"3954519","goto":"av","started":0,"total_count":0,"desc":"四少年枪王，誓破无情宿命。保方、碧咸、奥云破了\u201c枪神\u201d案后，在警队中被封为\u201c破案三剑侠\u201d。总督察黎SIR再次召集三人，参与一项保护内政要女儿阿雪来港参展的任务，三人起初不以为然，后来却发现，在阿雪的背后隐藏着重大阴谋\u2026\u2026","screen_date":"2001-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"陈国邦、黎耀祥、罗兰、梁焯满","staff":"导演：刘孝伟\n编剧：刘孝伟","length":87,"status":2,"attentions":0},{"title":"拳王","cover":"https://i0.hdslb.com/bfs/bangumi/fdff76bdc73e3ac7cacf4886064b56f2fb007985.jpg","uri":"bilibili://video/5415163","param":"5415163","goto":"av","started":0,"total_count":0,"desc":"沉默寡言的师兄阿明一向沉迷拳击，但他在一次胸有成竹的比赛中惨被击倒后，决心到泰国学艺，当地严格的训练不单改造拳手的体能，更能升拳手的尊严和擂台上无惧的精神。阿德自少随父学习国术，但有感中国武术在擂台不能尽展所长，故此便上拳馆苦练泰拳，企图扩阔搏击艺术的包容性和宽容度。","screen_date":"1991-11-10 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"吕颂贤、林敬刚、杜少津、刘玉翠 ","staff":"导演：刘国昌\n编剧：陈文强、冼锦青 ","length":104,"status":2,"attentions":0},{"title":"铁路之王","cover":"https://i0.hdslb.com/bfs/bangumi/9bb3703717f231e27ec2ac4b9ae415ab74879e64.jpg","uri":"bilibili://video/3868079","param":"3868079","goto":"av","started":0,"total_count":0,"desc":"一个不负责任的大学预科生Preston West被怀疑为了一笔可观的遗产杀害了他的父母。所以他逃跑试图寻找到真正的凶手：13号\u201c幽灵\u201d，一个疯狂的火车装卸游民。Preston开着货车，遇见了不怀好意的铁路工人，恶毒的铁路警察，隐藏的无业游民，神秘的女人，臭名昭著的Baron和他形形色色的游民帮。在一个出乎意料的结局中，他终于面对第13号\u201c幽灵\u201d。","screen_date":"2005-01-01 08:00:00","area":"美国","cover_mark":"免费观看","actors":"Ernest Borgnine、W.M. Comartin、Bobb Hopkins | See full cast & crew ","staff":"导演： Bobb Hopkins\n编剧： Bobb Hopkins","length":92,"status":2,"attentions":0},{"title":"城市王子","cover":"https://i0.hdslb.com/bfs/bangumi/a7ab0215f76261a6ae96939eeac6da92011a219f.jpg","uri":"bilibili://video/8475181","param":"8475181","goto":"av","started":0,"total_count":0,"desc":"王子拉，他的养子马来西亚的亿万富翁jaggoi锡布延，更使他比纯种的儿子太子锡布延是家庭的骄傲。当Dana公...","screen_date":"2012-01-01 08:00:00","area":"马来西亚","cover_mark":"免费观看","actors":"Julian Cheah、迈克尔·马德森","staff":"导演：Roslan Hussin \n编剧：Roslan Hussin ","length":83,"status":2,"attentions":0},{"title":"胡桃夹子：魔境冒险","cover":"https://i0.hdslb.com/bfs/bangumi/4d77bf510f295c3ad54e39246ab7ad53b9056111.jpg","uri":"bilibili://video/3954607","param":"3954607","goto":"av","started":0,"total_count":0,"desc":"九岁的小女孩玛丽（艾丽·范宁 Elle Fanning 饰）拥有锦衣玉食的生活，却缺乏父母的陪伴。圣诞节前夜，玛丽收到了叔叔送来的一份珍贵礼物\u2014\u2014一个装木偶的小房子和一只胡桃夹子。喜出望外的玛丽将胡桃夹子视作自己的知心伙伴，竟意外地发现它会说话，并声称自己名叫NC（查理·罗 Charlie Rowe 饰），是玩具王国的王子，然而在一场噩梦中，美好的王国被凶残的鼠王（约翰·特托罗 John Turturro 饰）占领了，他还将王子变成一只木偶永远驱逐出境，只有找到真正相信童话的人才能解除咒语。在雪仙子（朱莉娅·维斯托斯卡亚 Yuliya Vysotskaya 饰）的指引下，玛丽帮NC恢复了肉身，并勇敢地答应与他一起回王国打败鼠王，解放子民。然而，这两个毫无武力只有一颗纯真之心的孩子，能否对抗整支血腥残暴的老鼠大军和卑鄙狡猾的鼠王呢？\n片中歌曲多数改编自柴可夫斯基的交响乐，其中一部分来自芭蕾舞剧《胡桃夹子》。","screen_date":"2010-11-24 08:00:00","area":"英国","cover_mark":"免费观看","actors":"艾丽·范宁、内森·连恩、约翰·特托罗、查理·罗、弗朗西斯·德·拉·图瓦","staff":"导演：安德烈·康查洛夫斯基\n编剧：安德烈·康查洛夫斯基、Chris Solimine","length":108,"status":2,"attentions":0},{"title":"冰球坏小子","cover":"https://i0.hdslb.com/bfs/bangumi/2565d1fbcbab86a5aab19bc6c15d55140380dfa8.jpg","uri":"bilibili://video/3034374","param":"3034374","goto":"av","started":0,"total_count":0,"desc":"酒吧保安道格·格拉特（西恩·威廉·斯科特 Seann William Scott 饰）体格强壮，行事略有呆气，在一次观看冰球比赛时将不满观众嘘声的球员痛揍，他的壮举经好友拍摄公布后引起大众注意，阴差阳错加入当地一支冰球队从头学起，充当队中暴徒角色。一场场血战为道格赢来了知名度，在教练的请托和引荐下，道格进入职业小联盟的刺客队，刺客队中有因为受伤而产生心理阴影的昔日王牌球员泽维尔，而道格的任务，即是保证泽维尔等队友在场上的安全。道格在比赛之外结识了热爱冰球的姑娘伊娃（艾丽森·皮尔 Alison Pill 饰），他向姑娘笨拙的表达着自己的爱慕。另一方面，王牌冰场打手罗斯在前方等待着道格的挑战\u2026\u2026","screen_date":"2011-09-10 08:00:00","area":"美国,加拿大","cover_mark":"免费观看","actors":"西恩·威廉·斯科特、杰伊·巴鲁切尔、马克-安德烈·格隆丁、金·寇兹、艾丽森·皮尔、列维·施瑞博尔、里基·马比","staff":"导演：迈克尔·道斯\n编剧：杰伊·巴鲁切尔、埃文·戈德堡","length":91,"status":2,"attentions":0},{"title":"本X","cover":"https://i0.hdslb.com/bfs/bangumi/a2902b973fd05bf3bd8ae393dd048351f795c3e6.jpg","uri":"bilibili://video/8764697","param":"8764697","goto":"av","started":0,"total_count":0,"desc":"本X是本（格雷格·提姆曼斯 Greg Timmermans 饰）在游戏《霸王》里的名字，游戏里他技压群雄、所向披靡。然而现实中的本却是一个患有自闭症的少年，沉默寡言的他在同学们眼中犹如异类并且受尽那帮同学的欺负和侮辱。本时常幻想着自己就是游戏里面的勇士，可是现实的残酷却将一切幻想纷纷击碎。本游走于现实和游戏的之间，两者的界限逐渐模糊起来。本在游戏中结识一个叫斯嘉莱（劳拉·沃林登 Laura Verlinden 饰）的女孩，女孩用她的真诚和勇气鼓舞着本重拾自我，最终在本的臆想中女孩陪伴他走上了一条\u201c置之死地而后生\u201d的道路\u2026\u2026\n在2007年的第31届蒙特利尔电影节上，本片获得了美洲大奖以及评审团和观众的最高奖。","screen_date":"2007-09-26 08:00:00","area":"比利时,荷兰","cover_mark":"免费观看","actors":"格雷格·提姆曼斯、Laura Verlinden、Pol Goossen","staff":"导演：尼克·巴斯阿扎\n编剧：尼克·巴斯阿扎","length":93,"status":2,"attentions":0},{"title":"一个赌波的传说","cover":"https://i0.hdslb.com/bfs/bangumi/5ef1ad0c73a86ede8ad65a7d0f5449276181aea9.jpg","uri":"bilibili://video/4120650","param":"4120650","goto":"av","started":0,"total_count":0,"desc":"讲波佬钟仔将细鬼因贪念而死在母亲兰寿宴上的故事告诉英超酒吧内各酒客，以警惕他们不要沉迷赌博。可是每天还是有人向他索取，令他极为反感，一次更因不胜其烦乱中押中了一只必败球队，从此被人奉为波神.英超老板车仔因生意不佳而兼职替赌球杂志波经写文章,由于过分投入，其妻波波提出离婚。对足球一窍不通的榕榕，乐乐和芳芳都来凑热闹，不料意外大获全胜。","screen_date":"2003-03-12 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"王喜","staff":"导演： 刘孝伟\n编剧： 吴奕龙、岑智敏","length":93,"status":2,"attentions":0},{"title":"搏击之霸","cover":"https://i0.hdslb.com/bfs/bangumi/db33a6a2ba7614ed95f65981a5406e7db7a74070.jpg","uri":"bilibili://video/3934652","param":"3934652","goto":"av","started":0,"total_count":0,"desc":"罗伟辰又称\u201c拳神\u201d，是泰国华侨，他以快速的拳脚闻名于泰国街头。他已经将拳击看作一种艺术，他听说香港拳术天才成志退出拳击界，并隐居国内，拳神便决定找成志切磋。在国内拳神碰上贪杯的小芬，小芬带他到酒吧，老板洪强的弟弟洪力欺凌酒客，小芬利用拳神为酒客解围。成志常常喝酒麻痹自己，洪力迫成志对付拳神抵偿欠债，并暗设拳击赌赛图利，小芬破坏洪力计划，令洪力损失惨重，拳神向成志讨教，成志不肯，原因是他在拳赛中曾误杀对手，芬妈引发成志出手，成志终于明白，练武已经是赋予拳术生命，拳术已成为自己的生命的一部分，挥不走，甩不掉，洪力绑架小芬又破坏芬妈货仓，拳神被电单车队埋伏，险象环生，成志相助，众人逃生，洪强却找来几个武术高手埋伏，疲惫的拳神，成志只好施展混身解数对敌\u2026\u2026","screen_date":"2005-01-01 08:00:00","area":"中国香港","cover_mark":"免费观看","actors":"陈治良、林泉、桑伟淋、徐宝华、赵毅","staff":"导演：夏占士\n编剧：廖志强","length":85,"status":2,"attentions":0},{"title":"故事王StoryMan","cover":"https://i0.hdslb.com/bfs/active/9c1ec29c8bb40755bbabf3fcb92675de00765ef6.jpg","uri":"bilibili://splist/71977","param":"71977","goto":"sp","started":0,"total_count":0,"desc":"每一场比赛，参赛选手都将利用随机发放的比赛卡牌，讲出一段或搞笑或动人或悬疑的剧情，而评委们则根据选手们的临场表现进行打分，最终在残酷激烈的淘汰赛后选出能够拯救故事王国的最强故事王。\r\n","status":0,"attentions":0}]
         */


        data class ItemsBean(var title: String,
                             var cover: String,
                             var uri: String,
                             var param: String,
                             var goto: String,
                             var started: Int,
                             var total_count: Int,
                             var desc: String,
                             var screen_date: String,
                             var area: String,
                             var cover_mark: String,
                             var actors: String,
                             var staff: String,
                             var length: Int,
                             var status: Int,
                             var attentions: Int) {
            /**
             * title : 女王
             * cover : https://i0.hdslb.com/bfs/bangumi/7cf444b192492ac55dca5ba44e858e1dce614a81.jpg
             * uri : bilibili://video/4605417
             * param : 4605417
             * goto : av
             * started : 0
             * total_count : 0
             * desc : 1997年，戴安娜王妃车祸身亡，举国悲痛欲绝，但是英国王室人员却对此采取了逃避疏离的态度。这种漠不关心激怒了很多英国民众。民众反王室的情绪相当高涨，紧急形势让王室陷入了严重的危机。但是，英王伊丽沙白（海伦•米伦Helen Mirren 饰）并没有出来稳定民心，而是携家人躲到了度假行宫。托尼•布莱尔（麦克•辛 Michael Sheen 饰）此时刚出任首相，面对此刻棘手的情势，必须尽快找到平衡各方利益的措施，让王室摆脱信任危机，女王重新修好与国民的关系，而自己也在当中树立权威。
             * screen_date : 2006-09-15 08:00:00
             * area : 法国,英国,意大利
             * cover_mark : 免费观看
             * actors : 海伦·米伦、麦克·辛、詹姆斯·克伦威尔、阿历克斯·杰宁斯、安吉拉·兰斯伯瑞
             * staff : 导演：斯蒂芬·弗雷斯
             * 编剧：皮特·摩根
             * length : 103
             * status : 2
             * attentions : 0
             */


        }
    }
}
