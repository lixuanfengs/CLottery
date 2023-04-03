package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.strategy.service.algorithm.IDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: DrawConfig
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *  抽奖统一配置信息类
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:43
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawConfig {

    @Resource
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    /** 抽奖策略组 */
    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(Constants.StrategyMode.ENTIRETY.getCode(), entiretyRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(Constants.StrategyMode.SINGLE.getCode(), singleRateRandomDrawAlgorithm);
    }


}
