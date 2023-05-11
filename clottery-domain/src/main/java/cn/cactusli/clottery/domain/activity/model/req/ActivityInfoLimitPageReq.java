package cn.cactusli.clottery.domain.activity.model.req;

import cn.cactusli.clottery.common.PageRequest;

/**
 * Package: cn.cactusli.clottery.domain.activity.model.req
 * Description:
 *  活动分页查询请求对象
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 9:53
 * @Github https://github.com/lixuanfengs
 */
public class ActivityInfoLimitPageReq extends PageRequest {

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    public ActivityInfoLimitPageReq(int page, int rows) {
        super(page, rows);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

}
