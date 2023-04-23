package cn.cactusli.clottery.domain.rule.model.req;

import java.util.Map;

/**
 * Package: cn.cactusli.clottery.domain.rule.model.req
 * Description:
 *  决策物料
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 10:24
 * @Github https://github.com/lixuanfengs
 */
public class DecisionMatterReq {

    /** 规则树ID */
    private Long treeId;
    /** 用户ID */
    private String userId;
    /** 决策值 */
    private Map<String, Object> valMap;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getValMap() {
        return valMap;
    }

    public void setValMap(Map<String, Object> valMap) {
        this.valMap = valMap;
    }

}