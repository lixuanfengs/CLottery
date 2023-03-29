package cn.cactusli.clottery.test;

import cn.cactusli.clottery.infrastructure.dao.IActivityDao;
import cn.cactusli.clottery.infrastructure.po.Activity;
import cn.cactusli.clottery.rpc.IActivityBooth;
import cn.cactusli.clottery.rpc.req.ActivityReq;
import cn.cactusli.clottery.rpc.res.ActivityRes;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: ApiTest
 * Package: cn.cactusli.clottery.test
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 15:01
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class ApiTest {


    private Logger logger = LoggerFactory.getLogger(ApiTest.class);


    @DubboReference(interfaceClass = IActivityBooth.class, url = "dubbo://127.0.0.1:20880")
    private IActivityBooth activityBooth;

    @Test
    public void test_rpc() {
        ActivityReq req = new ActivityReq();
        req.setActivityId(100002L);
        ActivityRes result = activityBooth.queryActivityById(req);
        logger.info("测试结果：{}", JSON.toJSONString(result));

    }



}
