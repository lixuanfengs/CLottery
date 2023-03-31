package cn.cactusli.clottery.domain.strategy.service.draw.impl;

import cn.cactusli.clottery.domain.strategy.model.aggregates.StrategyRich;
import cn.cactusli.clottery.domain.strategy.model.req.DrawReq;
import cn.cactusli.clottery.domain.strategy.model.res.DrawResult;
import cn.cactusli.clottery.domain.strategy.repository.IStrategyRepository;
import cn.cactusli.clottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.cactusli.clottery.domain.strategy.service.draw.DrawBase;
import cn.cactusli.clottery.domain.strategy.service.draw.IDrawExec;
import cn.cactusli.clottery.infrastructure.po.Award;
import cn.cactusli.clottery.infrastructure.po.Strategy;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DrawExecImpl
 * Package: cn.cactusli.clottery.domain.strategy.service.draw.impl
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:47
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawExecImpl extends DrawBase implements IDrawExec {

    private Logger logger = LoggerFactory.getLogger(DrawExecImpl.class);

    @Resource
    private IStrategyRepository strategyRepository;

    @Override
    public DrawResult doDrawExec(DrawReq req) {

        logger.info("执行策略抽奖开始，strategyId：{}", req.getStrategyId());

        // 获取抽奖策略配置数据
        StrategyRich strategyRich = strategyRepository.queryStrategyRich(req.getStrategyId());
        Strategy strategy = strategyRich.getStrategy();
        List<StrategyDetail> strategyDetailList = strategyRich.getStrategyDetailList();

        // 校验和初始化数据
        checkAndInitRateData(req.getStrategyId(), strategy.getStrategyMode(), strategyDetailList);

        // 根据策略方式抽奖
        IDrawAlgorithm drawAlgorithm = drawAlgorithmMap.get(strategy.getStrategyMode());
        String awardId = drawAlgorithm.randomDraw(req.getStrategyId(), new ArrayList<>());

        // 获取奖品信息
        Award award = strategyRepository.queryAwardInfo(awardId);

        logger.info("执行策略抽奖完成，中奖用户：{} 奖品ID：{} 奖品名称：{}", req.getuId(), awardId, award.getAwardName());

        // 封装结果
        return new DrawResult(req.getuId(), req.getStrategyId(), awardId, award.getAwardName());
    }
}
