package cn.cactusli.clottery.domain.rule.service.logic.impl;

import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;
import cn.cactusli.clottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * Package: cn.cactusli.clottery.domain.rule.service.logic.impl
 * Description:
 *  性别规则
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 14:31
 * @Github https://github.com/lixuanfengs
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
}
