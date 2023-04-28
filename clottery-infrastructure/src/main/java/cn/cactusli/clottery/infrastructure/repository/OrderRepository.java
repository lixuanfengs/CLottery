package cn.cactusli.clottery.infrastructure.repository;

import cn.cactusli.clottery.domain.award.repository.IOrderRepository;
import cn.cactusli.clottery.infrastructure.dao.IUserStrategyExportDao;
import cn.cactusli.clottery.infrastructure.po.UserStrategyExport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Package: cn.cactusli.clottery.infrastructure.repository
 * Description:
 *  奖品表仓储服务
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 16:44
 * @Github https://github.com/lixuanfengs
 */
@Repository
public class OrderRepository implements IOrderRepository {

    @Resource
    private IUserStrategyExportDao userStrategyExportDao;

    @Override
    public void updateUserAwardState(String uId, Long orderId, String awardId, Integer grantState) {
        UserStrategyExport userStrategyExport = new UserStrategyExport();
        userStrategyExport.setuId(uId);
        userStrategyExport.setOrderId(orderId);
        userStrategyExport.setAwardId(awardId);
        userStrategyExport.setGrantState(grantState);

    }

}
