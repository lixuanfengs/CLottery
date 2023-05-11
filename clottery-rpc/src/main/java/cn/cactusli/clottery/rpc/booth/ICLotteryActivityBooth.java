package cn.cactusli.clottery.rpc.booth;

import cn.cactusli.clottery.rpc.booth.req.DrawReq;
import cn.cactusli.clottery.rpc.booth.req.QuantificationDrawReq;
import cn.cactusli.clottery.rpc.booth.res.DrawRes;

/**
 * Package: cn.cactusli.clottery.rpc
 * Description:
 *  抽奖活动展台接口
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/24 10:29
 * @Github https://github.com/lixuanfengs
 */
public interface ICLotteryActivityBooth {

    /**
     * 指定活动抽奖
     * @param drawReq 请求参数
     * @return        抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     * @param quantificationDrawReq 请求参数
     * @return                      抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);
}
