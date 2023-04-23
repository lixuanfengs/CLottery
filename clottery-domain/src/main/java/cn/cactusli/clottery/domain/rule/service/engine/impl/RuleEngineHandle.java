package cn.cactusli.clottery.domain.rule.service.engine.impl;

import cn.cactusli.clottery.domain.rule.model.aggregates.TreeRuleRich;
import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;
import cn.cactusli.clottery.domain.rule.model.res.EngineResult;
import cn.cactusli.clottery.domain.rule.model.vo.TreeNodeVO;
import cn.cactusli.clottery.domain.rule.repository.IRuleRepository;
import cn.cactusli.clottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Package: cn.cactusli.clottery.domain.rule.service.engine.impl
 * Description:
 *  规则引擎处理器
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 14:51
 * @Github https://github.com/lixuanfengs
 */
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository ruleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = ruleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null!");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }
}
