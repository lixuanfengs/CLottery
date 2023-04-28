package cn.cactusli.clottery.domain.award.service.goods.impl;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.award.model.req.GoodsReq;
import cn.cactusli.clottery.domain.award.model.res.DistributionRes;
import cn.cactusli.clottery.domain.award.service.goods.DistributionBase;
import cn.cactusli.clottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * ClassName: DescGoods
 * Package: cn.cactusli.clottery.domain.award.service.goods
 * Description:
 *  描述类商品，以文字形式展示给用户
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 10:33
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
