package cn.cactusli.clottery.application.process.deploy.impl;

import cn.cactusli.clottery.application.process.deploy.IActivityDeployProcess;
import cn.cactusli.clottery.domain.activity.model.aggregates.ActivityInfoLimitPageRich;
import cn.cactusli.clottery.domain.activity.model.req.ActivityInfoLimitPageReq;
import cn.cactusli.clottery.domain.activity.service.deploy.IActivityDeploy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Package: cn.cactusli.clottery.application.process.deploy.impl
 * Description:
 *   活动部署实现
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 10:01
 * @Github https://github.com/lixuanfengs
 */
@Service
public class ActivityDeployProcessImpl implements IActivityDeployProcess {

    @Resource
    private IActivityDeploy activityDeploy;

    @Override
    public ActivityInfoLimitPageRich queryActivityInfoLimitPage(ActivityInfoLimitPageReq req) {
        return activityDeploy.queryActivityInfoLimitPage(req);
    }
}
