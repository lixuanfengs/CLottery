package cn.cactusli.clottery.infrastructure.dao;

import cn.cactusli.clottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: IActivityDao
 * Package: cn.cactusli.clottery.infrastructure.dao
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:23
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}
