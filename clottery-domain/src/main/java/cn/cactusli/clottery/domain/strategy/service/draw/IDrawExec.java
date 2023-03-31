package cn.cactusli.clottery.domain.strategy.service.draw;

import cn.cactusli.clottery.domain.strategy.model.req.DrawReq;
import cn.cactusli.clottery.domain.strategy.model.res.DrawResult;

/**
 * ClassName: IDrawExec
 * Package: cn.cactusli.clottery.domain.strategy.service.draw
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 14:42
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IDrawExec {

    DrawResult doDrawExec(DrawReq req);
}
