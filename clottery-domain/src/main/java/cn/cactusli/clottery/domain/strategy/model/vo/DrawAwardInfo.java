package cn.cactusli.clottery.domain.strategy.model.vo;

/**
 * ClassName: DrawAwardInfo
 * Package: cn.cactusli.clottery.domain.strategy.model.vo
 * Description:
 *  中奖奖品信息
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/3 15:02
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawAwardInfo {

    /**
     * 奖品ID
     */
    private String rewardId;

    /**
     * 奖品名称
     */
    private String awardName;

    public DrawAwardInfo() {
    }

    public DrawAwardInfo(String rewardId, String awardName) {
        this.rewardId = rewardId;
        this.awardName = awardName;
    }

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
