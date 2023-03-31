package cn.cactusli.clottery.domain.strategy.repository;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.infrastructure.po.Award;

/**
 * ClassName: IStrategyRepository
 * Package: cn.cactusli.clottery.domain.strategy.repository
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:24
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

}
