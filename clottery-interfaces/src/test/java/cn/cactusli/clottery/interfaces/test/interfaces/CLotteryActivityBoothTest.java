package cn.cactusli.clottery.interfaces.test.interfaces;

import cn.cactusli.clottery.rpc.ILotteryActivityBooth;
import cn.cactusli.clottery.rpc.req.DrawReq;
import cn.cactusli.clottery.rpc.req.QuantificationDrawReq;
import cn.cactusli.clottery.rpc.res.DrawRes;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Package: cn.cactusli.clottery.interfaces.test.interfaces
 * Description:
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/24 14:43
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class CLotteryActivityBoothTest {

    private Logger logger = LoggerFactory.getLogger(CLotteryActivityBoothTest.class);

    @Resource
    private ILotteryActivityBooth lotteryActivityBooth;

    @Test
    public void test_doDraw() {
        DrawReq drawReq = new DrawReq();
        drawReq.setuId("cactusli");
        drawReq.setActivityId(100001L);
        DrawRes drawRes = lotteryActivityBooth.doDraw(drawReq);
        logger.info("请求参数：{}", JSON.toJSONString(drawReq));
        logger.info("测试结果：{}", JSON.toJSONString(drawRes));

    }

    @Test
    public void test_doQuantificationDraw() {
        QuantificationDrawReq req = new QuantificationDrawReq();
        req.setuId("cactusli");
        req.setTreeId(2110081902L);
        req.setValMap(new HashMap<String, Object>(){{
            put("gender","woman");
            put("age","21");
        }});
        DrawRes drawRes = lotteryActivityBooth.doQuantificationDraw(req);
        logger.info("请求参数：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(drawRes));

    }
}
