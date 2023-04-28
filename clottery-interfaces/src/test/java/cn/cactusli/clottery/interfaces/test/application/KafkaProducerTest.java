package cn.cactusli.clottery.interfaces.test.application;

import cn.cactusli.clottery.application.mq.producer.KafkaProducer;
import cn.cactusli.clottery.application.process.IActivityProcess;
import cn.cactusli.clottery.application.process.req.DrawProcessReq;
import cn.cactusli.clottery.application.process.res.DrawProcessResult;
import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.activity.model.vo.InvoiceVO;
import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Package: cn.cactusli.clottery.interfaces.test.application
 * Description:
 *  Kafka 消息测试
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/28 10:29
 * @Github https://github.com/lixuanfengs
 */
@SpringBootTest
public class KafkaProducerTest {

    private Logger logger = LoggerFactory.getLogger(KafkaProducerTest.class);

    @Resource
    private KafkaProducer kafkaProducer;

    @Resource
    private IActivityProcess activityProcess;

    @Test
    public void test_send() throws InterruptedException {

        InvoiceVO invoice = new InvoiceVO();
        invoice.setuId("cactusli");
        invoice.setOrderId(1444540456057864192L);
        invoice.setAwardId("3");
        invoice.setAwardType(Constants.AwardType.DESC.getCode());
        invoice.setAwardName("Code");
        invoice.setAwardContent("苹果电脑");
        invoice.setShippingAddress(null);
        invoice.setExtInfo(null);

        kafkaProducer.sendLotteryInvoice(invoice);

        while (true) {
            Thread.sleep(1000);
        }
    }


    @Test
    public void test_doDrawProcess() {
        DrawProcessReq req = new DrawProcessReq();
        req.setuId("cactusli");
        req.setActivityId(100003L);
        DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(req);
        logger.info("请求入参：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(drawProcessResult));
    }

}
