package cn.cactusli.clottery.domain.strategy.model.aggregates;

import cn.cactusli.clottery.infrastructure.po.Strategy;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;

import java.util.List;

/**
 * ClassName: StrategyRich
 * Package: cn.cactusli.clottery.domain.strategy.model.aggregates
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 10:50
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class StrategyRich {
    // 策略ID
    private Long strategyId;
    // 策略配置
    private Strategy strategy;
    // 策略明细
    private List<StrategyDetail> strategyDetailList;

    public StrategyRich() {
    }

    public StrategyRich(Long strategyId, Strategy strategy, List<StrategyDetail> strategyDetailList) {
        this.strategyId = strategyId;
        this.strategy = strategy;
        this.strategyDetailList = strategyDetailList;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<StrategyDetail> getStrategyDetailList() {
        return strategyDetailList;
    }

    public void setStrategyDetailList(List<StrategyDetail> strategyDetailList) {
        this.strategyDetailList = strategyDetailList;
    }
}
