package cn.cactusli.clottery.application.process.draw;

import cn.cactusli.clottery.application.process.draw.req.DrawProcessReq;
import cn.cactusli.clottery.application.process.draw.res.DrawProcessResult;
import cn.cactusli.clottery.application.process.draw.res.RuleQuantificationCrowdResult;
import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;

/**
 * ClassName: IActivityProcess
 * Package: cn.cactusli.clottery.application.process
 * Description:
 *  活动抽奖流程编排接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/12 13:46
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IActivityDrawProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);


    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);
}
