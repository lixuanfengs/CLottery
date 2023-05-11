package cn.cactusli.clottery.domain.activity.model.res;

import cn.cactusli.clottery.common.Result;

/**
 * ClassName: PartakeResult
 * Package: cn.cactusli.clottery.domain.activity.model.res
 * Description:
 *  活动参与结果
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/11 9:56
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class PartakeResult extends Result {


    /** 策略ID */
    private Long strategyId;
    /** 活动领取ID */
    private Long takeId;
    /** 库存 */
    private Integer stockCount;
    /** activity 库存剩余 */
    private Integer stockSurplusCount;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getTakeId() {
        return takeId;
    }

    public void setTakeId(Long takeId) {
        this.takeId = takeId;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getStockSurplusCount() {
        return stockSurplusCount;
    }

    public void setStockSurplusCount(Integer stockSurplusCount) {
        this.stockSurplusCount = stockSurplusCount;
    }
}
