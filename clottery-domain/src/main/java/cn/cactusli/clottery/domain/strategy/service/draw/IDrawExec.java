package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.domain.strategy.model.req.DrawReq;
import cn.cactusli.clottery.domain.strategy.model.res.DrawResult;

/**
 * ClassName: IDrawExec
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *  抽奖执行接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:42
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IDrawExec {

    /**
     * 抽奖方法
     * @param req   抽奖参数；用户ID、策略ID
     * @return  中奖结果
     */
    DrawResult doDrawExec(DrawReq req);
}
