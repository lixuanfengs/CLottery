package cn.cactusli.clottery.domain.rule.service.engine;

import cn.cactusli.clottery.domain.rule.service.logic.LogicFilter;
import cn.cactusli.clottery.domain.rule.service.logic.impl.UserAgeFilter;
import cn.cactusli.clottery.domain.rule.service.logic.impl.UserGenderFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Package: cn.cactusli.clottery.domain.rule.service.engine
 * Description:
 *  规则配置
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 14:36
 * @Github https://github.com/lixuanfengs
 */
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;

    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }
}
