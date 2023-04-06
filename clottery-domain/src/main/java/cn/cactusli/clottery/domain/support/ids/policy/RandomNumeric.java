package cn.cactusli.clottery.domain.support.ids.policy;

import cn.cactusli.clottery.domain.support.ids.IIdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * ClassName: RandomNumeric
 * Package: cn.cactusli.clottery.domain.support.ids.policy
 * Description:
 *  工具类生成 org.apache.commons.lang3.RandomStringUtils
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/6 17:39
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
@Component
public class RandomNumeric implements IIdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }
}
