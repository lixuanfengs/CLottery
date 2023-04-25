package cn.cactusli.clottery.interfaces.facade;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.infrastructure.dao.IActivityDao;
import cn.cactusli.clottery.infrastructure.po.Activity;
import cn.cactusli.clottery.rpc.IActivityBooth;
import cn.cactusli.clottery.rpc.dto.ActivityDto;
import cn.cactusli.clottery.rpc.req.ActivityReq;
import cn.cactusli.clottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * ClassName: ActivityBooth
 * Package: cn.cactusli.clottery.interfaces
 * Description:
 *  活动展台
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:48
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@DubboService
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());
        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
