package cn.cactusli.clottery.infrastructure.dao;

import cn.cactusli.clottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: IAwardDao
 * Package: cn.cactusli.clottery.infrastructure.dao
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 11:26
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Mapper
public interface IAwardDao {

    /**
     * 查询奖品信息
     *
     * @param awardId 奖品ID
     * @return        奖品信息
     */
    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     *
     * @param list 奖品配置
     */
    void insertList(List<Award> list);


}
