package cn.cactusli.clottery;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: CLotteryApplication
 * Package: cn.cactusli.clottery
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:47
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@SpringBootApplication
@Configurable
@EnableDubbo
public class CLotteryApplicationInterfaces {
    public static void main(String[] args) {
        SpringApplication.run(CLotteryApplicationInterfaces.class, args);
    }
}
