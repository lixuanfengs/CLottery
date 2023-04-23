package cn.cactusli.clottery.domain.rule.service.engine;

import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;
import cn.cactusli.clottery.domain.rule.model.res.EngineResult;

/**
 * Package: cn.cactusli.clottery.domain.rule.service.engine
 * Description:
 *  规则过滤器引擎
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 14:34
 * @Github https://github.com/lixuanfengs
 */
public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter    规则决策物料
     * @return          规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);
}
