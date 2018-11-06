package bjpkten.precycledviewdemo.entity;

import java.util.List;

/**
 * Created by Kodulf on 2018/11/5.
 */
public class Room {

    /**
     * moderatorLevel : 8
     * hotIcon : http://static.guojiang.tv/app/img/common/room/hot_icon_1.png
     * mid : 17792931
     * nickname : 宇航女友
     * city : 西双版纳傣族自治州
     * isPlaying : true
     * addTime : 2018-06-25 11:30:28
     * doMission : false
     * weight : 2100000002
     * videoPlayUrl : rtmp://9180.liveplay.myqcloud.com/live/9180_1015209
     * rType : 1
     * playStartTime : 1541472244
     * announcement : 睿睿感谢与你们相遇
     * id : 1015209
     * verified : false
     * verifyInfo :
     * fansNum : 105
     * timeZoneHotWeight : 1000000000
     * hotBg : http://static.guojiang.tv/app/img/common/room/hot_1.png
     * tags : []
     * headPic : http://static.guojiang.tv/app/upload/2018_10_16/6c807fdf16a84f53991010601961c2b8.jpg
     * onlineNum : 1870
     * cornerTxt : 热门TOP1
     * rid : 1015209
     * contentPackageId : 2
     * topics : []
     * isPk : true
     * sex : 2
     */

    private int moderatorLevel;
    private String hotIcon;
    private String mid;
    private String nickname;
    private String city;
    private boolean isPlaying;
    private String addTime;
    private boolean doMission;
    private int weight;
    private String videoPlayUrl;
    private int rType;
    private int playStartTime;
    private String announcement;
    private int id;
    private boolean verified;
    private String verifyInfo;
    private int fansNum;
    private int timeZoneHotWeight;
    private String hotBg;
    private String headPic;
    private int onlineNum;
    private String cornerTxt;
    private int rid;
    private int contentPackageId;
    private boolean isPk;
    private int sex;
    private List<?> tags;
    private List<?> topics;

    public int getModeratorLevel() {
        return moderatorLevel;
    }

    public void setModeratorLevel(int moderatorLevel) {
        this.moderatorLevel = moderatorLevel;
    }

    public String getHotIcon() {
        return hotIcon;
    }

    public void setHotIcon(String hotIcon) {
        this.hotIcon = hotIcon;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public boolean isDoMission() {
        return doMission;
    }

    public void setDoMission(boolean doMission) {
        this.doMission = doMission;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVideoPlayUrl() {
        return videoPlayUrl;
    }

    public void setVideoPlayUrl(String videoPlayUrl) {
        this.videoPlayUrl = videoPlayUrl;
    }

    public int getRType() {
        return rType;
    }

    public void setRType(int rType) {
        this.rType = rType;
    }

    public int getPlayStartTime() {
        return playStartTime;
    }

    public void setPlayStartTime(int playStartTime) {
        this.playStartTime = playStartTime;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getVerifyInfo() {
        return verifyInfo;
    }

    public void setVerifyInfo(String verifyInfo) {
        this.verifyInfo = verifyInfo;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getTimeZoneHotWeight() {
        return timeZoneHotWeight;
    }

    public void setTimeZoneHotWeight(int timeZoneHotWeight) {
        this.timeZoneHotWeight = timeZoneHotWeight;
    }

    public String getHotBg() {
        return hotBg;
    }

    public void setHotBg(String hotBg) {
        this.hotBg = hotBg;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public int getOnlineNum() {
        return onlineNum;
    }

    public void setOnlineNum(int onlineNum) {
        this.onlineNum = onlineNum;
    }

    public String getCornerTxt() {
        return cornerTxt;
    }

    public void setCornerTxt(String cornerTxt) {
        this.cornerTxt = cornerTxt;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getContentPackageId() {
        return contentPackageId;
    }

    public void setContentPackageId(int contentPackageId) {
        this.contentPackageId = contentPackageId;
    }

    public boolean isIsPk() {
        return isPk;
    }

    public void setIsPk(boolean isPk) {
        this.isPk = isPk;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<?> getTags() {
        return tags;
    }

    public void setTags(List<?> tags) {
        this.tags = tags;
    }

    public List<?> getTopics() {
        return topics;
    }

    public void setTopics(List<?> topics) {
        this.topics = topics;
    }
}
