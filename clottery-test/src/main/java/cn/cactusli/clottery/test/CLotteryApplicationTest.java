package cn.cactusli.clottery.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * ClassName: CLotteryApplicationTest
 * Package: cn.cactusli.clottery.test
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 15:59
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configurable
@EnableDubbo
public class CLotteryApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(CLotteryApplicationTest.class, args);
    }
}
