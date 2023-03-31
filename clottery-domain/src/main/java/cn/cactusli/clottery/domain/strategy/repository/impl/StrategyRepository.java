package cn.cactusli.clottery.domain.strategy.repository.impl;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.domain.strategy.repository.IStrategyRepository;
import cn.cactusli.clottery.infrastructure.dao.IAwardDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDetailDao;
import cn.cactusli.clottery.infrastructure.po.Award;
import cn.cactusli.clottery.infrastructure.po.Strategy;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: StrategyRepository
 * Package: cn.cactusli.clottery.domain.strategy.repository.impl
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:25
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource
    private IAwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }
}
