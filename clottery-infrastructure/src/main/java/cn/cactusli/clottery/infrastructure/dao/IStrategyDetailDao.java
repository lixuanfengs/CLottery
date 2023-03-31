package cn.cactusli.clottery.infrastructure.dao;

import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: IStrategyDetailDao
 * Package: cn.cactusli.clottery.infrastructure.dao
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:27
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Mapper
public interface IStrategyDetailDao {

    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

}
