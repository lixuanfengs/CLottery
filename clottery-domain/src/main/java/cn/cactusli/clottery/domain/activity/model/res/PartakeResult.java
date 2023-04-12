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

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
