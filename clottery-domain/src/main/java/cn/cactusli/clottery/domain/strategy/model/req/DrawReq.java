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
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 防重ID
     */
    private String uuid;

    public DrawReq() {
    }

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }

    public DrawReq(String uId, Long strategyId, String uuid) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.uuid = uuid;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }}
