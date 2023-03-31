package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.domain.strategy.model.vo.AwardRateInfo;
import cn.cactusli.clottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DrawBase
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:43
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawBase extends DrawConfig {

    public void checkAndInitRateData(Long strategyId, Integer strategyMode, List<StrategyDetail> strategyDetailList) {
        if (1 != strategyMode) return;
        IDrawAlgorithm drawAlgorithm = drawAlgorithmMap.get(strategyMode);

        boolean existRateTuple = drawAlgorithm.isExistRateTuple(strategyId);
        if (existRateTuple) return;

        List<AwardRateInfo> awardRateInfoList = new ArrayList<>(strategyDetailList.size());
        for (StrategyDetail strategyDetail : strategyDetailList) {
            awardRateInfoList.add(new AwardRateInfo(strategyDetail.getAwardId(), strategyDetail.getAwardRate()));
        }

        drawAlgorithm.initRateTuple(strategyId, awardRateInfoList);
    }
}
