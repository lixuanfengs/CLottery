package cn.cactusli.clottery.domain.strategy.model.aggregates;


import cn.cactusli.clottery.domain.strategy.model.vo.StrategyBriefVO;
import cn.cactusli.clottery.domain.strategy.model.vo.StrategyDetailBriefVO;

import java.util.List;

/**
 * ClassName: StrategyRich
 * Package: cn.cactusli.clottery.domain.strategy.model.aggregates
 * Description:
 *  抽奖策略聚合对象
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 10:50
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class StrategyRich {

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略配置
     */
    private StrategyBriefVO strategy;

    /**
     * 策略明细
     */
    private List<StrategyDetailBriefVO> strategyDetailList;

    public StrategyRich() {
    }

    public StrategyRich(Long strategyId, StrategyBriefVO strategy, List<StrategyDetailBriefVO> strategyDetailList) {
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

    public StrategyBriefVO getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyBriefVO strategy) {
        this.strategy = strategy;
    }

    public List<StrategyDetailBriefVO> getStrategyDetailList() {
        return strategyDetailList;
    }

    public void setStrategyDetailList(List<StrategyDetailBriefVO> strategyDetailList) {
        this.strategyDetailList = strategyDetailList;
    }

}
