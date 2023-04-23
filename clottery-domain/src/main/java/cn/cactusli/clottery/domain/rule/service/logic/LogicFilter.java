package cn.cactusli.clottery.domain.rule.service.logic;

import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;
import cn.cactusli.clottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * Package: cn.cactusli.clottery.domain.rule.service.logic
 * Description:
 *  规则过滤器接口
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 10:27
 * @Github https://github.com/lixuanfengs
 */
public interface LogicFilter {


    /**
     * 逻辑决策器
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return                     下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return               决策值
     */
    String matterValue(DecisionMatterReq decisionMatter);

}
