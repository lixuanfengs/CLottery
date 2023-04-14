package cn.cactusli.clottery.application.process;

import cn.cactusli.clottery.application.process.req.DrawProcessReq;
import cn.cactusli.clottery.application.process.res.DrawProcessResult;

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
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);
}
