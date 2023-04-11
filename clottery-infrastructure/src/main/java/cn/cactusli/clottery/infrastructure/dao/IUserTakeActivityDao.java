package cn.cactusli.clottery.infrastructure.dao;

import cn.cactusli.clottery.infrastructure.po.UserTakeActivity;
import cn.cactusli.middleware.db.router.annotation.DBRouter;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: IUserTakeActivityDao
 * Package: cn.cactusli.clottery.infrastructure.dao
 * Description:
 *   用户领取活动表DAO
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 17:26
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Mapper
public interface IUserTakeActivityDao {

    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    @DBRouter(key = "uId")
    void insert(UserTakeActivity userTakeActivity);
}
