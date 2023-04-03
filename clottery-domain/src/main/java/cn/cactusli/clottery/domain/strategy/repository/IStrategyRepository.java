package cn.cactusli.clottery.domain.strategy.repository;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.infrastructure.po.Award;

import java.util.List;

/**
 * ClassName: IStrategyRepository
 * Package: cn.cactusli.clottery.domain.strategy.repository
 * Description:
 *  策略表仓储服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:24
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
