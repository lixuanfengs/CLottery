package cn.cactusli.clottery.domain.activity.service.stateflow.impl;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.domain.activity.service.stateflow.IStateHandler;
import cn.cactusli.clottery.domain.activity.service.stateflow.StateConfig;
import org.springframework.stereotype.Service;

/**
 * ClassName: StateHandlerImpl
 * Package: cn.cactusli.clottery.domain.activity.service.stateflow.impl
 * Description:
 *  状态处理服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 17:13
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Service
public class StateHandlerImpl extends StateConfig implements IStateHandler {

    @Override
    public Result arraignment(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).arraignment(activityId, currentStatus);
    }

    @Override
    public Result checkPass(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).checkPass(activityId, currentStatus);
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result close(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).close(activityId, currentStatus);
    }

    @Override
    public Result open(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).open(activityId, currentStatus);
    }

    @Override
    public Result doing(Long activityId, Enum<Constants.ActivityState> currentStatus) {
        return stateGroup.get(currentStatus).doing(activityId, currentStatus);
    }
}
