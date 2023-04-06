package cn.cactusli.clottery.interfaces.test.domain;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.support.ids.IIdGenerator;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Map;

/**
 * ClassName: SupportTest
 * Package: cn.cactusli.clottery.interfaces.test.domain
 * Description:
 *  支撑领域测试
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/6 17:51
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class SupportTest {

    private Logger logger = LoggerFactory.getLogger(SupportTest.class);

    @Resource
    private Map<Constants.Ids, IIdGenerator> idGeneratorMap;

    @Test
    public void test_ids() {
        logger.info("雪花算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.SnowFlake).nextId());
        logger.info("日期算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.ShortCode).nextId());
        logger.info("随机算法策略，生成ID：{}", idGeneratorMap.get(Constants.Ids.RandomNumeric).nextId());
    }
}
