package cn.cactusli.clottery.domain.rule.repository;

import cn.cactusli.clottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * Package: cn.cactusli.clottery.domain.rule.repository
 * Description:
 *  规则信息仓储服务接口
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 14:52
 * @Github https://github.com/lixuanfengs
 */
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId 决策树ID
     * @return       决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);
}
