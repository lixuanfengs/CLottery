package cn.cactusli.clottery.domain.support.ids;

/**
 * ClassName: IIdGenerator
 * Package: cn.cactusli.clottery.domain.support.ids
 * Description:
 *  生成ID接口
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/6 16:35
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public interface IIdGenerator {

    /**
     * 获取ID，目前有两种实现方式
     * 1. 雪花算法，用于生成单号
     * 2. 日期算法，用于生成活动编号类，特性是生成数字串较短，但指定时间内不能生成太多
     * 3. 随机算法，用于生成策略ID
     *
     * @return
     */
    long nextId();
}
