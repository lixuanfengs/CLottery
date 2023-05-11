package cn.cactusli.clottery.rpc.booth.req;

import java.io.Serializable;

/**
 * ClassName: ActivityReq
 * Package: cn.cactusli.clottery.rpc.req
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:40
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class ActivityReq implements Serializable {

    private Long activityId;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
}
