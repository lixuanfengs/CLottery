package cn.cactusli.clottery.domain.award.service.factory;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.award.service.goods.IDistributionGoods;
import cn.cactusli.clottery.domain.award.service.goods.impl.CouponGoods;
import cn.cactusli.clottery.domain.award.service.goods.impl.DescGoods;
import cn.cactusli.clottery.domain.award.service.goods.impl.PhysicalGoods;
import cn.cactusli.clottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: GoodsConfig
 * Package: cn.cactusli.clottery.domain.award.service.factory
 * Description:
 *  各类发奖奖品配置类
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 10:30
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class GoodsConfig {

    /** 奖品发放策略组 */
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
    }

}
