package cn.cactusli.clottery.domain.activity.service.deploy;

import cn.cactusli.clottery.domain.activity.model.req.ActivityConfigReq;

/**
 * ClassName: IActivityDeploy
 * Package: cn.cactusli.clottery.domain.activity.service.deploy
 * Description:
 *  署活动配置接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 16:40
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IActivityDeploy {

    /**
     * 创建活动信息
     *
     * @param req 活动配置信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * 修改活动信息
     *
     * @param req 活动配置信息
     */
    void updateActivity(ActivityConfigReq req);

}
