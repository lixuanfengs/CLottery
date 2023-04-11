package cn.cactusli.clottery.interfaces.test.dao;

import cn.cactusli.clottery.infrastructure.dao.IUserTakeActivityDao;
import cn.cactusli.clottery.infrastructure.po.UserTakeActivity;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ClassName: UserTakeActivityDaoTest
 * Package: cn.cactusli.clottery.interfaces.test.dao
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/10 10:05
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class UserTakeActivityDaoTest {

    private Logger logger = LoggerFactory.getLogger(ActivityDaoTest.class);

    @Resource
    private IUserTakeActivityDao userTakeActivityDao;

    @Test
    public void test_insert() {
        UserTakeActivity userTakeActivity = new UserTakeActivity();
        userTakeActivity.setuId("Ukdli109op89oi"); // 1库：Ukdli109op89oi 2库：Ukdli109op811d
        userTakeActivity.setTakeId(121019889410L);
        userTakeActivity.setActivityId(100001L);
        userTakeActivity.setActivityName("测试活动");
        userTakeActivity.setTakeDate(new Date());
        userTakeActivity.setTakeCount(10);
        userTakeActivity.setUuid("Ukdli109op89oi");

        userTakeActivityDao.insert(userTakeActivity);
    }

}
