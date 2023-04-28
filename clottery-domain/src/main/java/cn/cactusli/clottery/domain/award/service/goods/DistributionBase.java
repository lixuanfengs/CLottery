package cn.cactusli.clottery.domain.award.service.goods;

import cn.cactusli.clottery.domain.award.repository.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * ClassName: DistributionBase
 * Package: cn.cactusli.clottery.domain.award.service.goods
 * Description:
 *  配送货物基础共用类
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 10:32
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DistributionBase {

    protected Logger logger = LoggerFactory.getLogger(DistributionBase.class);

    @Resource
    private IOrderRepository orderRepository;

    protected void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        orderRepository.updateUserAwardState(uId, orderId, awardId, grantState);
    }

}
