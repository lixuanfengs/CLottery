package cn.cactusli.clottery.domain.rule.model.aggregates;

import cn.cactusli.clottery.domain.rule.model.vo.TreeNodeVO;
import cn.cactusli.clottery.domain.rule.model.vo.TreeRootVO;

import java.util.Map;

/**
 * Package: cn.cactusli.clottery.domain.rule.model.aggregates
 * Description:
 *  规则树聚合
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 10:24
 * @Github https://github.com/lixuanfengs
 */
public class TreeRuleRich {

    /** 树根信息 */
    private TreeRootVO treeRoot;
    /** 树节点ID -> 子节点 */
    private Map<Long, TreeNodeVO> treeNodeMap;

    public TreeRootVO getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRootVO treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNodeVO> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNodeVO> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
