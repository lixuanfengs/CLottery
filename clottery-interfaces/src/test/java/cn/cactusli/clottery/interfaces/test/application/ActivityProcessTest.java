package cn.cactusli.clottery.interfaces.test.application;

import cn.cactusli.clottery.application.process.IActivityProcess;
import cn.cactusli.clottery.application.process.req.DrawProcessReq;
import cn.cactusli.clottery.application.process.res.DrawProcessResult;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: ActivityProcessTest
 * Package: cn.cactusli.clottery.interfaces.test.application
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/12 17:27
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class ActivityProcessTest {

    private Logger logger = LoggerFactory.getLogger(ActivityProcessTest.class);

    @Resource
    private IActivityProcess activityProcess;

    @Test
    public void test_doDrawProcess() {
        DrawProcessReq req = new DrawProcessReq();
        req.setuId("cactusli");
        req.setActivityId(100001L);
        DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(req);

        logger.info("请求入参：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(drawProcessResult));
    }

}
