package cn.cactusli.clottery.interfaces.test.dao;

import cn.cactusli.clottery.infrastructure.dao.IActivityDao;
import cn.cactusli.clottery.infrastructure.po.Activity;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: ActivityDaoTest
 * Package: cn.cactusli.clottery.interfaces.test.dao
 * Description:
 *  测试活动表 DAO
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/7 17:31
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class ActivityDaoTest {

    private Logger logger = LoggerFactory.getLogger(ActivityDaoTest.class);

    @Resource
    private IActivityDao activityDao;

    @Test
    public void test_queryActivityById() {
        Activity activity = activityDao.queryActivityById(100001L);
        logger.info("测试结果：{}", JSON.toJSONString(activity));
    }

}
