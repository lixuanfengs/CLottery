package cn.cactusli.clottery.domain.award.service.goods.impl;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.award.model.req.GoodsReq;
import cn.cactusli.clottery.domain.award.model.res.DistributionRes;
import cn.cactusli.clottery.domain.award.service.goods.DistributionBase;
import cn.cactusli.clottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * ClassName: CouponGoofs
 * Package: cn.cactusli.clottery.domain.award.service.goods
 * Description:
 *  优惠券商品
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 10:32
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class CouponGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用优惠券发放接口
        logger.info("模拟调用优惠券发放接口 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
