package cn.cactusli.clottery.interfaces.test.dao;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.support.ids.IIdGenerator;
import cn.cactusli.clottery.infrastructure.dao.IUserStrategyExportDao;
import cn.cactusli.clottery.infrastructure.po.UserStrategyExport;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * ClassName: UserStrategyExportDaoTest
 * Package: cn.cactusli.clottery.interfaces.test.dao
 * Description:
 *  用户策略计算结果表Dao测试
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/10 16:55
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class UserStrategyExportDaoTest {

    private Logger logger = LoggerFactory.getLogger(UserStrategyExportDaoTest.class);

    @Resource
    private IUserStrategyExportDao userStrategyExportDao;

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_insert() {
        UserStrategyExport userStrategyExport = new UserStrategyExport();
        userStrategyExport.setuId("Ukdli109op89oi");
        userStrategyExport.setActivityId(idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        userStrategyExport.setOrderId(idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        userStrategyExport.setStrategyId(idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
        userStrategyExport.setStrategyMode(Constants.StrategyMode.SINGLE.getCode());
        userStrategyExport.setGrantType(1);
        userStrategyExport.setGrantDate(new Date());
        userStrategyExport.setGrantState(1);
        userStrategyExport.setAwardId("1");
        userStrategyExport.setAwardType(Constants.AwardType.DESC.getCode());
        userStrategyExport.setAwardName("IMac");
        userStrategyExport.setAwardContent("奖品描述");
        userStrategyExport.setUuid(String.valueOf(userStrategyExport.getOrderId()));

        userStrategyExportDao.insert(userStrategyExport);
    }

    @Test
    public void test_select() {
        UserStrategyExport userStrategyExport = userStrategyExportDao.queryUserStrategyExportByUId("Ukdli109op89oi");
        logger.info("测试结果：{}", JSON.toJSONString(userStrategyExport));
    }
}
