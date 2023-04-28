package cn.cactusli.clottery.domain.award.service.factory;

import cn.cactusli.clottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Service;

/**
 * ClassName: DistributionGoodsFactory
 * Package: cn.cactusli.clottery.domain.award.service.factory
 * Description:
 *  配送商品简单工厂，提供获取配送服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 10:43
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        return goodsMap.get(awardType);
    }
}
