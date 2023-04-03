package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.domain.strategy.repository.IStrategyRepository;
import cn.cactusli.clottery.infrastructure.po.Award;

import javax.annotation.Resource;

/**
 * ClassName: DrawStrategySupport
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *  抽奖策略数据支撑，一些通用的数据服务
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/3 11:30
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawStrategySupport extends DrawConfig {

    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     * @param strategyId
     * @return
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     * @param awardId
     * @return
     */
    protected Award queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }
}
