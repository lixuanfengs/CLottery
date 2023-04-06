package cn.cactusli.clottery.domain.support.ids;

import cn.cactusli.clottery.common.Constants;
import cn.cactusli.clottery.domain.support.ids.policy.RandomNumeric;
import cn.cactusli.clottery.domain.support.ids.policy.ShortCode;
import cn.cactusli.clottery.domain.support.ids.policy.SnowFlake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: IdContext
 * Package: cn.cactusli.clottery.domain.support.ids
 * Description:
 *  Id 策略模式上下文配置「在正式的完整的系统架构中，ID 的生成会有单独的服务来完成，其他服务来调用 ID 生成接口即可」
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/6 17:41
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Configuration
public class IdContext {

    /**
     * 创建 ID 生成策略对象，属于策略设计模式的使用方式
     *
     * @param snowFlake 雪花算法，长码，大量
     * @param shortCode 日期算法，短码，少量，全局唯一需要自己保证
     * @param randomNumeric 随机算法，短码，大量，全局唯一需要自己保证
     * @return IIdGenerator 实现类
     */
    @Bean
    public Map<Constants.Ids, IIdGenerator> idGenerator(SnowFlake snowFlake, ShortCode shortCode, RandomNumeric randomNumeric) {
       Map<Constants.Ids, IIdGenerator> idGeneratorMap = new HashMap<>(8);
       idGeneratorMap.put(Constants.Ids.SnowFlake, snowFlake);
       idGeneratorMap.put(Constants.Ids.ShortCode, shortCode);
       idGeneratorMap.put(Constants.Ids.RandomNumeric, randomNumeric);
       return idGeneratorMap;
    }

}
