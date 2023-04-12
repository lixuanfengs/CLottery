package cn.cactusli.clottery.domain.activity.service.partake;

import cn.cactusli.clottery.domain.activity.model.req.PartakeReq;
import cn.cactusli.clottery.domain.activity.model.vo.ActivityBillVO;
import cn.cactusli.clottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * ClassName: ActivityPartakeSupport
 * Package: cn.cactusli.clottery.domain.activity.service.partake
 * Description:
 *  活动领取模操作，一些通用的数据服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/11 10:00
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req) {
        return activityRepository.queryActivityBill(req);
    }
}
