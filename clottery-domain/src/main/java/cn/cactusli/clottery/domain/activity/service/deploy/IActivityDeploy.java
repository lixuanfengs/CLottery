package cn.cactusli.clottery.domain.activity.service.deploy;

import cn.cactusli.clottery.domain.activity.model.req.ActivityConfigReq;
import cn.cactusli.clottery.domain.activity.model.vo.ActivityVO;

import java.util.List;

/**
 * ClassName: IActivityDeploy
 * Package: cn.cactusli.clottery.domain.activity.service.deploy
 * Description:
 *  部署活动配置接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 16:40
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IActivityDeploy {

    /**
     * 创建活动信息
     *
     * @param req 活动配置信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * 修改活动信息
     *
     * @param req 活动配置信息
     */
    void updateActivity(ActivityConfigReq req);

    /**
     * 扫描待处理的活动列表，状态为：通过、活动中
     * <p>
     * 通过 -> 时间符合时 -> 活动中
     * 活动中 -> 时间到期时 -> 关闭
     *
     * @param id ID
     * @return 待处理的活动集合
     */
    List<ActivityVO> scanToDoActivityList(Long id);

}
