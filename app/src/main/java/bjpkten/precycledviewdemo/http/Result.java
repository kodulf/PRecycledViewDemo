package bjpkten.precycledviewdemo.http;


import java.io.Serializable;

/**
 * Created by zhangyinshan on 2017/5/3.
 *
 * {
 "reason": "手机号码",
 "result": null,
 "error_code": 0
 }
 */
public class Result<T> implements Serializable{
    /**
     * errno : 0
     * msg :
     * data : [{"rid":903540,"playStartTime":1541418756,"sex":2,"mid":"11799652","nickname":"🐲Dw-卡特🎈","headPic":"http://static.guojiang.tv/app/upload/2018_09_27/c5d44e50f3dce90513a85ba2f060958d.jpg","isPlaying":true,"onlineNum":2292,"fansNum":3346,"announcement":"星光第一电音小公举","moderatorLevel":21,"verified":true,"verifyInfo":"星光第一电音小公举","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_903540","topics":[],"weight":2100000405,"timeZoneHotWeight":1000000000,"city":"外星人？","tags":[],"addTime":"2017-11-03 15:33:05","contentPackageId":2,"rType":1,"cornerTxt":"热门TOP1","hotBg":"http://static.guojiang.tv/app/img/common/room/hot_1.png","hotIcon":"http://static.guojiang.tv/app/img/common/room/hot_icon_1.png","id":903540,"doMission":true,"isPk":false},{"rid":895523,"playStartTime":1541415992,"sex":2,"mid":"11063998","nickname":"🌺小沐沐🌺求升级","headPic":"http://static.guojiang.tv/app/upload/2018_11_05/fe2c3e38ae412a1c1958a358929ecd56.jpg","isPlaying":true,"onlineNum":2023,"fansNum":421,"announcement":"🍀 珍惜所有的相遇 🍀 每晚20:00不见不散","moderatorLevel":10,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_895523","topics":[],"weight":2100000002,"timeZoneHotWeight":1000000000,"city":"嘉兴市","tags":[],"addTime":"2017-09-19 20:28:00","contentPackageId":2,"rType":2,"cornerTxt":"热门TOP2-10","hotBg":"http://static.guojiang.tv/app/img/common/room/hot_2.png","hotIcon":"http://static.guojiang.tv/app/img/common/room/hot_icon_2.png","id":895523,"doMission":false,"isPk":false},{"rid":907492,"playStartTime":1541318792,"sex":2,"mid":"10199310","nickname":"👶🏿莫一Moe","headPic":"http://static.guojiang.tv/app/upload/2018_10_09/e955b9c097a7b77f1717a0f4ad59e7f8.jpg","isPlaying":true,"onlineNum":2259,"fansNum":1308260,"announcement":"星光认证主播","moderatorLevel":22,"verified":true,"verifyInfo":"星光认证主播","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_907492","topics":[],"weight":1100000108,"timeZoneHotWeight":0,"city":"北京市","tags":[],"addTime":"2017-11-28 16:00:25","contentPackageId":2,"rType":3,"bgColor":"#ff0000","cornerTxt":"官方推荐","id":907492,"doMission":true,"isPk":true},{"rid":935503,"playStartTime":1541253922,"sex":2,"mid":"14082358","nickname":"柒柒酱ฅ","headPic":"http://static.guojiang.tv/app/upload/2018_11_03/3f3915b1b022048570f7aa9a98e63dc6.jpg","isPlaying":true,"onlineNum":1616,"fansNum":206,"announcement":"别翻了 就我咯","moderatorLevel":7,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_935503","topics":[],"weight":1100000301,"timeZoneHotWeight":0,"city":"外星人？","tags":[],"addTime":"2018-02-26 17:20:24","contentPackageId":2,"rType":3,"bgColor":"#1e90ff","cornerTxt":"精选新人","id":935503,"doMission":true,"isPk":false},{"rid":1042623,"playStartTime":1541366900,"sex":2,"mid":"18448554","nickname":"♕菲菲🌸求守护","headPic":"http://static.guojiang.tv/app/upload/2018_11_01/24309af997fca7f9a16287db1c3a47d7.jpg","isPlaying":true,"onlineNum":2222,"fansNum":1938,"announcement":"要是你能一直陪着我就好了","moderatorLevel":16,"verified":true,"verifyInfo":"星光百变小天后","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1042623","topics":[],"weight":1100000124,"timeZoneHotWeight":0,"city":"深圳市","tags":[],"addTime":"2018-08-02 15:54:00","contentPackageId":2,"rType":4,"id":1042623,"doMission":false,"isPk":false},{"rid":1058396,"playStartTime":1541420041,"sex":2,"mid":"19224175","nickname":"伊人红妆为谁舞","headPic":"http://static.guojiang.tv/app/upload/2018_10_19/3575fcc67fa9c868889d878bc1b2399d.jpg","isPlaying":true,"onlineNum":2219,"fansNum":1453,"announcement":"今天不适宜太嗨。","moderatorLevel":17,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1058396","topics":[],"weight":2100000004,"timeZoneHotWeight":1000000000,"city":"秦皇岛市","tags":[],"addTime":"2018-08-23 23:14:12","contentPackageId":2,"rType":4,"id":1058396,"doMission":false,"isPk":true},{"rid":47416,"playStartTime":1541426524,"sex":2,"mid":"756845","nickname":"🔥波波女郎🔥","headPic":"http://static.guojiang.tv/app/upload/2018_10_21/355f74bd3d3ddbb93246ea239213ff15.jpg","isPlaying":true,"onlineNum":2284,"fansNum":546685,"announcement":"ha ha","moderatorLevel":28,"verified":true,"verifyInfo":"梦天堂网络首推Showgirl、封面模特","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_47416","topics":[],"weight":2100000699,"timeZoneHotWeight":1000000000,"city":"外星人？","tags":[],"addTime":"2016-07-06 18:09:15","contentPackageId":2,"rType":3,"bgColor":"#ff0000","cornerTxt":"官方推荐","id":47416,"doMission":true,"isPk":true},{"rid":994466,"playStartTime":1541383478,"sex":2,"mid":"14570147","nickname":"☔初夏☔","headPic":"http://static.guojiang.tv/app/upload/2018_10_24/33fed9b73e93166d30210aec0cb9de18.jpg","isPlaying":true,"onlineNum":1819,"fansNum":264,"announcement":"一路同行，感恩有你，感谢遇见！\u2026感恩支持与陪伴！！！","moderatorLevel":9,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_994466","topics":[],"weight":1100000003,"timeZoneHotWeight":0,"city":"西安市","tags":[],"addTime":"2018-05-20 10:00:59","contentPackageId":2,"rType":3,"bgColor":"#1e90ff","cornerTxt":"精选新人","id":994466,"doMission":false,"isPk":false},{"rid":157186,"playStartTime":1541426797,"sex":2,"mid":"1368022","nickname":"🌸 北北大宝贝吖✨","headPic":"http://static.guojiang.tv/app/upload/2018_10_25/a0c53d23eb4eca3c7bf7f13320e338ab.jpg","isPlaying":true,"onlineNum":2615,"fansNum":766881,"announcement":"星光签约主播","moderatorLevel":28,"verified":true,"verifyInfo":"星光签约主播","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_157186","topics":[],"weight":2100000916,"timeZoneHotWeight":1000000000,"city":"晋中市","tags":[],"addTime":"2016-09-30 15:04:46","contentPackageId":2,"rType":4,"id":157186,"doMission":true,"isPk":true},{"rid":1099356,"playStartTime":1541425926,"sex":2,"mid":"20659985","nickname":"喵喵小媳(6136)","headPic":"http://static.guojiang.tv/app/upload/2018_11_02/4574dd3d12b76ca1585ce96d75ac166a.jpg","isPlaying":true,"onlineNum":294,"fansNum":182,"announcement":"你有故事，我有酒。。。来来来，喝完这杯，还有一杯。。","moderatorLevel":0,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1099356","topics":[],"weight":2100000013,"timeZoneHotWeight":1000000000,"city":"内江市","tags":[],"addTime":"2018-11-02 10:03:17","contentPackageId":2,"rType":4,"id":1099356,"doMission":false,"isPk":false},{"rid":909513,"playStartTime":1541425400,"sex":2,"mid":"12515551","nickname":"苏柒♛求家人","headPic":"http://static.guojiang.tv/app/upload/2018_06_20/64d8e25682c80efffe17a28ecb54d5e2.jpg","isPlaying":true,"onlineNum":2255,"fansNum":4910,"announcement":"星光签约主播","moderatorLevel":19,"verified":true,"verifyInfo":"星光签约主播","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_909513","topics":[],"weight":2100000056,"timeZoneHotWeight":1000000000,"city":"成都市","tags":[],"addTime":"2017-12-09 16:08:47","contentPackageId":2,"rType":3,"bgColor":"#ff0000","cornerTxt":"官方推荐","id":909513,"doMission":true,"isPk":false},{"rid":1099065,"playStartTime":1541419069,"sex":1,"mid":"20469332","nickname":"歌手-庭维(8196","headPic":"http://static.guojiang.tv/app/upload/2018_11_02/9b29f56c679ef8ad9156ef52b73a52dd.jpg","isPlaying":true,"onlineNum":209,"fansNum":11,"announcement":"来吧，聊点啥","moderatorLevel":0,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1099065","topics":[],"weight":2100000003,"timeZoneHotWeight":1000000000,"city":"廊坊市","tags":[],"addTime":"2018-11-01 18:35:41","contentPackageId":2,"rType":3,"bgColor":"#1e90ff","cornerTxt":"精选新人","id":1099065,"doMission":false,"isPk":false},{"rid":903573,"playStartTime":1541338517,"sex":2,"mid":"9173285","nickname":"🍡叫我大团子🍡","headPic":"http://static.guojiang.tv/app/upload/2018_10_24/dcc7645c8f2eece2a2e65fcc7472fe2b.jpg","isPlaying":true,"onlineNum":2354,"fansNum":546012,"announcement":"星光第一综艺咖","moderatorLevel":27,"verified":true,"verifyInfo":"星光第一综艺咖","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_903573","topics":[],"weight":1100000465,"timeZoneHotWeight":0,"city":"南京市","tags":[],"addTime":"2017-11-03 17:34:01","contentPackageId":2,"rType":4,"id":903573,"doMission":true,"isPk":false},{"rid":821783,"playStartTime":1541426551,"sex":2,"mid":"9605389","nickname":"穆雪儿","headPic":"http://static.guojiang.tv/app/upload/2018_09_07/d705b32fc0e3a385cdeef1b68b876c83.jpg","isPlaying":true,"onlineNum":2331,"fansNum":34752,"announcement":"相识是缘，且行且珍惜，，感谢有你们\u2026\u2026\u2026","moderatorLevel":20,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_821783","topics":[],"weight":2100000043,"timeZoneHotWeight":1000000000,"city":"抚州市","tags":[],"addTime":"2018-10-04 09:37:13","contentPackageId":2,"rType":4,"id":821783,"doMission":true,"isPk":true},{"rid":154145,"playStartTime":1541258431,"sex":2,"mid":"1639090","nickname":"miss🌸静妞","headPic":"http://static.guojiang.tv/app/upload/2018_10_31/e81f21006a96e9e22b9869a518823c64.jpg","isPlaying":true,"onlineNum":2279,"fansNum":1552608,"announcement":"星光第一元气美少女","moderatorLevel":27,"verified":true,"verifyInfo":"星光第一元气美少女","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_154145","topics":[],"weight":1100000723,"timeZoneHotWeight":0,"city":"金华市","tags":[],"addTime":"2016-09-07 10:42:49","contentPackageId":2,"rType":3,"bgColor":"#ff0000","cornerTxt":"官方推荐","id":154145,"doMission":true,"isPk":false},{"rid":1043763,"playStartTime":1541424365,"sex":1,"mid":"10998799","nickname":"呼叫沐阳s686","headPic":"http://static.guojiang.tv/app/upload/2018_08_24/0b87a4427b3a15b759b0afec34b5fe1e.jpg","isPlaying":true,"onlineNum":2213,"fansNum":287,"announcement":"半拉子脱口秀主播","moderatorLevel":14,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1043763","topics":[],"weight":2100000003,"timeZoneHotWeight":1000000000,"city":"洛阳市","tags":[],"addTime":"2018-08-04 05:54:17","contentPackageId":2,"rType":3,"bgColor":"#0000cd","cornerTxt":"才艺主播","id":1043763,"doMission":false,"isPk":false},{"rid":1069300,"playStartTime":1541420830,"sex":2,"mid":"19634150","nickname":"💞欣梦碎💞","headPic":"http://static.guojiang.tv/app/upload/2018_09_10/49352ad83aadd7cd412c93b41b6d9586.jpg","isPlaying":true,"onlineNum":1860,"fansNum":390,"announcement":"好冷","moderatorLevel":10,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1069300","topics":[],"weight":2100000003,"timeZoneHotWeight":1000000000,"city":"外星人？","tags":[],"addTime":"2018-09-10 10:35:52","contentPackageId":2,"rType":4,"id":1069300,"doMission":false,"isPk":true},{"rid":1081474,"playStartTime":1541420697,"sex":2,"mid":"20106557","nickname":"安妮(3565)","headPic":"http://static.guojiang.tv/app/upload/2018_10_05/73f9fc1c391c7ccad8dac906dccaffed.jpg","isPlaying":true,"onlineNum":856,"fansNum":206,"announcement":"安妮来了","moderatorLevel":3,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1081474","topics":[],"weight":2100000026,"timeZoneHotWeight":1000000000,"city":"海口市","tags":[],"addTime":"2018-10-04 19:19:33","contentPackageId":2,"rType":4,"id":1081474,"doMission":false,"isPk":false},{"rid":1069995,"playStartTime":1541417171,"sex":2,"mid":"19374876","nickname":"乐乐妹妹（尊师凯伦）","headPic":"http://static.guojiang.tv/app/upload/2018_09_26/5261ac8b3988c11a9e11d6e25aa8c4c9.jpg","isPlaying":true,"onlineNum":2216,"fansNum":849,"announcement":"晚上好ヽ(ﾟ∀ﾟ)ﾉ!","moderatorLevel":14,"verified":true,"verifyInfo":"星光认证主播","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1069995","topics":[],"weight":2100000010,"timeZoneHotWeight":1000000000,"city":"重庆市","tags":[],"addTime":"2018-09-11 16:40:07","contentPackageId":2,"rType":3,"bgColor":"#ff0000","cornerTxt":"官方推荐","id":1069995,"doMission":false,"isPk":false},{"rid":1031175,"playStartTime":1541408273,"sex":2,"mid":"18263809","nickname":"唱歌的小星星","headPic":"http://static.guojiang.tv/app/upload/2018_10_29/a5c7607275a1b7357c026a1a326ba164.jpg","isPlaying":true,"onlineNum":2221,"fansNum":749,"announcement":"哈哈哈","moderatorLevel":14,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_1031175","topics":[],"weight":1100000009,"timeZoneHotWeight":0,"city":"外星人？","tags":[],"addTime":"2018-07-16 23:00:55","contentPackageId":2,"rType":3,"bgColor":"#1e90ff","cornerTxt":"精选新人","id":1031175,"doMission":true,"isPk":true},{"rid":839424,"playStartTime":1541423230,"sex":2,"mid":"9912153","nickname":"朵儿要。。。","headPic":"http://static.guojiang.tv/app/upload/2018_09_06/5049aba6b3372df9596dd37d0b9de0d2.jpg","isPlaying":true,"onlineNum":2286,"fansNum":39571,"announcement":"做你的小公主吧💃","moderatorLevel":18,"verified":false,"verifyInfo":"","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_839424","topics":[],"weight":2100000277,"timeZoneHotWeight":1000000000,"city":"保定市","tags":[],"addTime":"2017-07-15 21:08:38","contentPackageId":2,"rType":4,"id":839424,"doMission":true,"isPk":true},{"rid":779764,"playStartTime":1541423241,"sex":2,"mid":"8888881","nickname":"My💫️遇见好运气","headPic":"http://static.guojiang.tv/app/upload/2018_10_11/c36a1989f3242e096bfeb5add7e8a986.jpg","isPlaying":true,"onlineNum":2255,"fansNum":829948,"announcement":"有你们真好","moderatorLevel":23,"verified":true,"verifyInfo":"星光唯一彩虹","videoPlayUrl":"rtmp://9180.liveplay.myqcloud.com/live/9180_779764","topics":[],"weight":2100000145,"timeZoneHotWeight":1000000000,"city":"嘉兴市","tags":[],"addTime":"2017-06-12 13:43:08","contentPackageId":2,"rType":4,"id":779764,"doMission":true,"isPk":false}]
     */

    private int errno;
    private String msg;
    private T data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        if(errno==0)
            return true;
        else
            return false;
    }

//
//    public static final int FAIL = -1;
//    public static final int SUCCESS = 0;
//
//    private String reason;
//    private T result;
//    private int error_code = FAIL;
//
//
//    public boolean isSuccess(){
//
//        return error_code==SUCCESS;
//    }
//    public String getReason() {
//        return reason;
//    }
//
//    public void setReason(String reason) {
//        this.reason = reason;
//    }
//
//    public T getResult() {
//        return result;
//    }
//
//    public void setResult(T result) {
//        this.result = result;
//    }
//
//    public int getError_code() {
//        return error_code;
//    }
//
//    public void setError_code(int error_code) {
//        this.error_code = error_code;
//    }
//
//    @Override
//    public String toString() {
//        return "http.entity.Result{" +
//                "reason='" + reason + '\'' +
//                ", result=" + result +
//                ", error_code=" + error_code +
//                '}';
//    }


}

