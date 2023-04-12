package cn.cactusli.clottery.domain.activity.model.req;

import java.util.Date;

/**
 * ClassName: PartakeReq
 * Package: cn.cactusli.clottery.domain.activity.model.req
 * Description:
 *  参与活动请求
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/11 9:55
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class PartakeReq {

    /** 用户ID */
    private String uId;
    /** 活动ID */
    private Long activityId;
    /** 活动领取时间 */
    private Date partakeDate;

    public PartakeReq() {
    }

    public PartakeReq(String uId, Long activityId) {
        this.uId = uId;
        this.activityId = activityId;
        this.partakeDate = new Date();
    }

    public PartakeReq(String uId, Long activityId, Date partakeDate) {
        this.uId = uId;
        this.activityId = activityId;
        this.partakeDate = partakeDate;
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

    public Date getPartakeDate() {
        return partakeDate;
    }

    public void setPartakeDate(Date partakeDate) {
        this.partakeDate = partakeDate;
    }
}
