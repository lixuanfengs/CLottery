package cn.cactusli.clottery.application.process.res;

import cn.cactusli.clottery.common.Result;

/**
 * Package: cn.cactusli.clottery.application.process.res
 * Description:
 *     规则量化人群,决策树映射结果
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/24 10:41
 * @Github https://github.com/lixuanfengs
 */
public class RuleQuantificationCrowdResult extends Result {


    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
