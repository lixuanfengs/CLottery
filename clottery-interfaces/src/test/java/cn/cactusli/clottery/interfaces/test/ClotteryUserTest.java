package cn.cactusli.clottery.interfaces.test;

import cn.cactusli.clottery.domain.strategy.model.req.DrawReq;
import cn.cactusli.clottery.domain.strategy.model.vo.AwardRateInfo;
import cn.cactusli.clottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import cn.cactusli.clottery.domain.strategy.service.draw.IDrawExec;
import cn.cactusli.clottery.infrastructure.dao.IActivityDao;
import cn.cactusli.clottery.infrastructure.dao.IStrategyDetailDao;
import cn.cactusli.clottery.infrastructure.po.Activity;
import cn.cactusli.clottery.infrastructure.po.StrategyDetail;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: ClotteryUser
 * Package: cn.cactusli.clottery.interfaces.test
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/3 15:59
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class ClotteryUserTest {

    private Logger logger = LoggerFactory.getLogger(ClotteryUserTest.class);

    @Resource
    private IActivityDao activityDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Resource(name = "entiretyRateRandomDrawAlgorithm")
    private IDrawAlgorithm entiretyRateRandomDrawAlgorithm;


    @Resource
    private IDrawExec drawExec;


    @Test
    public void test_drawExec() {
        // 数据库里的 strategyMode 改为2 需要初始化数据奖品中将的概率
        /* Long strategyId = 10001L; // 策略id
        List<StrategyDetail> strategyDetails = strategyDetailDao.queryStrategyDetailList(strategyId); // 查询奖品配置

        // 获取奖品中将的概率进行初始化
        List<AwardRateInfo> strategyList = strategyDetails.stream().map(m -> {
            return new AwardRateInfo(m.getAwardId(), m.getAwardRate());
        }).collect(Collectors.toList());
        entiretyRateRandomDrawAlgorithm.initRateTuple(strategyId, strategyList);*/

        drawExec.doDrawExec(new DrawReq("小傅哥", 10001L));
        drawExec.doDrawExec(new DrawReq("小佳佳", 10001L));
        drawExec.doDrawExec(new DrawReq("小蜗牛", 10001L));
        drawExec.doDrawExec(new DrawReq("八杯水", 10001L));
    }

    @Test
    public void test_insert() {
        Activity activity = new Activity();
        activity.setActivityId(100001L);
        activity.setActivityName("测试活动");
        activity.setActivityDesc("仅用于插入数据测试");
        activity.setBeginDateTime(new Date());
        activity.setEndDateTime(new Date());
        activity.setStockCount(100);
        activity.setTakeCount(10);
        activity.setState(0);
        activity.setCreator("仙人球");
        activityDao.insert(activity);
    }

    @Test
    public void test_select() {
        Activity activity = activityDao.queryActivityById(100001L);
        logger.info("测试结果：{}", JSON.toJSONString(activity));
    }

}
