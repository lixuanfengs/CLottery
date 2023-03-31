package cn.cactusli.clottery.infrastructure.dao;

import cn.cactusli.clottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: IStrategyDao
 * Package: cn.cactusli.clottery.infrastructure.dao
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:27
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);

}
