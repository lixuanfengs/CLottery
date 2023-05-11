package cn.cactusli.clottery.rpc.deploy;

import cn.cactusli.clottery.rpc.booth.res.ActivityRes;
import cn.cactusli.clottery.rpc.deploy.req.ActivityPageReq;
import cn.cactusli.clottery.rpc.deploy.res.DeployActivityRes;

/**
 * Package: cn.cactusli.clottery.rpc.deploy
 * Description:
 *  抽奖活动部署服务接口
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 9:44
 * @Github https://github.com/lixuanfengs
 */
public interface ICLotteryActivityDeploy {

    /**
     * 通过分页查询活动列表信息，给ERP运营使用
     *
     * @param req   查询参数
     * @return      查询结果
     */
    DeployActivityRes queryActivityListByPageForErp(ActivityPageReq req);
}
