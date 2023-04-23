package cn.cactusli.clottery.interfaces.test.domain;

import cn.cactusli.clottery.domain.rule.model.req.DecisionMatterReq;
import cn.cactusli.clottery.domain.rule.model.res.EngineResult;
import cn.cactusli.clottery.domain.rule.service.engine.EngineFilter;
import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Package: cn.cactusli.clottery.interfaces.test.domain
 * Description:
 *  规则引擎测试
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/21 17:36
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class RuleTest {

    private Logger logger = LoggerFactory.getLogger(RuleTest.class);

    @Resource
    private EngineFilter engineFilter;

    @Test
    public void test_process() {
        DecisionMatterReq req = new DecisionMatterReq();
        req.setTreeId(2110081902L);
        req.setUserId("cactusli");
        req.setValMap(new HashMap<String, Object>() {{
            put("gender", "man");
            put("age", "25");
        }});


        EngineResult res = engineFilter.process(req);

        logger.info("请求参数：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(res));
    }
}
