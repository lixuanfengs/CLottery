package cn.cactusli.clottery.domain.activity.model.req;

import cn.cactusli.clottery.domain.activity.model.aggregates.ActivityConfigRich;

/**
 * ClassName: ActivityConfigReq
 * Package: cn.cactusli.clottery.domain.activity.model.req
 * Description:
 *  活动配置请求对象
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 16:27
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class ActivityConfigReq {

    /** 活动ID */
    private Long activityId;

    /** 活动配置信息 */
    private ActivityConfigRich activityConfigRich;

    public ActivityConfigReq() {
    }

    public ActivityConfigReq(Long activityId, ActivityConfigRich activityConfigRich) {
        this.activityId = activityId;
        this.activityConfigRich = activityConfigRich;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public ActivityConfigRich getActivityConfigRich() {
        return activityConfigRich;
    }

    public void setActivityConfigRich(ActivityConfigRich activityConfigRich) {
        this.activityConfigRich = activityConfigRich;
    }
}

