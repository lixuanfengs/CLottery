package cn.cactusli.clottery.domain.strategy.model.vo;

import java.math.BigDecimal;

/**
 * ClassName: AwardRateInfo
 * Package: cn.cactusli.clottery.domain.strategy.model.vo
 * Description:
 *  奖品概率信息，奖品编号、库存、概率
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/31 10:58
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class AwardRateInfo {

    // 奖品ID
    private String awardId;

    // 中奖概率
    private BigDecimal awardRate;

    public AwardRateInfo() {
    }

    public AwardRateInfo(String awardId, BigDecimal awardRate) {
        this.awardId = awardId;
        this.awardRate = awardRate;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
    }
}
