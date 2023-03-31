package cn.cactusli.clottery.domain.strategy.model.req;

/**
 * ClassName: DrawReq
 * Package: cn.cactusli.clottery.domain.strategy.model.req
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 10:57
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawReq {

    // 用户ID
    private String uId;

    // 策略ID
    private Long strategyId;

    public DrawReq() {
    }

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
