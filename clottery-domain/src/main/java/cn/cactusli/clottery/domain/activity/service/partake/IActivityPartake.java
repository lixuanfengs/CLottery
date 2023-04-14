package cn.cactusli.clottery.domain.activity.service.partake;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.domain.activity.model.req.PartakeReq;
import cn.cactusli.clottery.domain.activity.model.res.PartakeResult;
import cn.cactusli.clottery.domain.activity.model.vo.DrawOrderVO;

/**
 * ClassName: IActivityPartake
 * Package: cn.cactusli.clottery.domain.activity.service.partake
 * Description:
 *  抽奖活动参与接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 16:47
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);


    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);


}
