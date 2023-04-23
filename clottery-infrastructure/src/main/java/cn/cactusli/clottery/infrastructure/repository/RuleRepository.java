package cn.cactusli.clottery.infrastructure.repository;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.rule.model.aggregates.TreeRuleRich;
import cn.cactusli.clottery.domain.rule.model.vo.TreeNodeLineVO;
import cn.cactusli.clottery.domain.rule.model.vo.TreeNodeVO;
import cn.cactusli.clottery.domain.rule.model.vo.TreeRootVO;
import cn.cactusli.clottery.domain.rule.repository.IRuleRepository;
import cn.cactusli.clottery.infrastructure.dao.RuleTreeDao;
import cn.cactusli.clottery.infrastructure.dao.RuleTreeNodeDao;
import cn.cactusli.clottery.infrastructure.dao.RuleTreeNodeLineDao;
import cn.cactusli.clottery.infrastructure.po.RuleTree;
import cn.cactusli.clottery.infrastructure.po.RuleTreeNode;
import cn.cactusli.clottery.infrastructure.po.RuleTreeNodeLine;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: cn.cactusli.clottery.infrastructure.repository
 * Description:
 *  规则信息仓储
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 16:49
 * @Github https://github.com/lixuanfengs
 */
@Repository
public class RuleRepository implements IRuleRepository {

    @Resource
    private RuleTreeDao ruleTreeDao;
    @Resource
    private RuleTreeNodeDao ruleTreeNodeDao;
    @Resource
    private RuleTreeNodeLineDao ruleTreeNodeLineDao;

    @Override
    public TreeRuleRich queryTreeRuleRich(Long treeId) {

        // 规则树
        RuleTree ruleTree = ruleTreeDao.queryRuleTreeByTreeId(treeId);
        TreeRootVO treeRoot = new TreeRootVO();
        treeRoot.setTreeId(ruleTree.getId());
        treeRoot.setTreeRootNodeId(ruleTree.getTreeRootNodeId());
        treeRoot.setTreeName(ruleTree.getTreeName());

        // 树节点->树连线
        Map<Long, TreeNodeVO> treeNodeMap = new HashMap<>();
        List<RuleTreeNode> ruleTreeNodeList = ruleTreeNodeDao.queryRuleTreeNodeList(treeId);
        for (RuleTreeNode treeNode : ruleTreeNodeList) {

            List<TreeNodeLineVO> treeNodeLineInfoList = new ArrayList<>();
            if (Constants.NodeType.STEM.equals(treeNode.getNodeType())) {
                RuleTreeNodeLine ruleTreeNodeLineReq = new RuleTreeNodeLine();
                ruleTreeNodeLineReq.setTreeId(treeId);
                ruleTreeNodeLineReq.setNodeIdFrom(treeNode.getId());

                List<RuleTreeNodeLine> ruleTreeNodeLineList = ruleTreeNodeLineDao.queryRuleTreeNodeLineList(ruleTreeNodeLineReq);
                for (RuleTreeNodeLine treeNodeLine : ruleTreeNodeLineList) {
                    TreeNodeLineVO treeNodeLineInfo = new TreeNodeLineVO();
                    treeNodeLineInfo.setNodeIdFrom(treeNodeLine.getNodeIdFrom());
                    treeNodeLineInfo.setNodeIdTo(treeNodeLine.getNodeIdTo());
                    treeNodeLineInfo.setRuleLimitType(treeNodeLine.getRuleLimitType());
                    treeNodeLineInfo.setRuleLimitValue(treeNodeLine.getRuleLimitValue());
                    treeNodeLineInfoList.add(treeNodeLineInfo);
                }
            }
            TreeNodeVO treeNodeInfo = new TreeNodeVO();
            treeNodeInfo.setTreeId(treeNode.getTreeId());
            treeNodeInfo.setTreeNodeId(treeNode.getId());
            treeNodeInfo.setNodeType(treeNode.getNodeType());
            treeNodeInfo.setNodeValue(treeNode.getNodeValue());
            treeNodeInfo.setRuleKey(treeNode.getRuleKey());
            treeNodeInfo.setRuleDesc(treeNode.getRuleDesc());
            treeNodeInfo.setTreeNodeLineInfoList(treeNodeLineInfoList);

            treeNodeMap.put(treeNode.getId(), treeNodeInfo);

        }


        TreeRuleRich treeRuleRich = new TreeRuleRich();
        treeRuleRich.setTreeRoot(treeRoot);
        treeRuleRich.setTreeNodeMap(treeNodeMap);
        return treeRuleRich;
    }
}
