package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.domain.strategy.service.algorithm.IDrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: DrawConfig
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:43
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawConfig {


    @Resource
    private IDrawAlgorithm defaultRateRandomDrawAlgorithm;

    @Resource
    private IDrawAlgorithm singleRateRandomDrawAlgorithm;

    protected static Map<Integer, IDrawAlgorithm> drawAlgorithmMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmMap.put(1, defaultRateRandomDrawAlgorithm);
        drawAlgorithmMap.put(2, singleRateRandomDrawAlgorithm);
    }


}
