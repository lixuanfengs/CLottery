package cn.cactusli.clottery.application.process.req;

/**
 * ClassName: DrawProcessReq
 * Package: cn.cactusli.clottery.application.process.req
 * Description:
 *  抽奖请求
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/12 11:31
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawProcessReq {

    /** 用户ID */
    private String uId;
    /** 活动ID */
    private Long activityId;

    public DrawProcessReq() {
    }

    public DrawProcessReq(String uId, Long activityId) {
        this.uId = uId;
        this.activityId = activityId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
