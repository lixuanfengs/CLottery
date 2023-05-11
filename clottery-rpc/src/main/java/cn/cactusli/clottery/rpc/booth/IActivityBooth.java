package cn.cactusli.clottery.rpc.booth;

import cn.cactusli.clottery.rpc.booth.req.ActivityReq;
import cn.cactusli.clottery.rpc.booth.res.ActivityRes;

/**
 * ClassName: IActivityBooth
 * Package: cn.cactusli.clottery.rpc
 * Description:
 *  活动展台
 *      1. 创建活动
 *      2. 更新活动
 *      3. 查询活动
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:38
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
