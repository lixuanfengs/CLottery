package cn.cactusli.clottery.domain.activity.model.vo;

/**
 * ClassName: AlterStateVO
 * Package: cn.cactusli.clottery.domain.activity.model.vo
 * Description:
 *  变更活动状态对象
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/4 16:25
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class AlterStateVO {

    /** 活动ID */
    private Long activityId;

    /** 更新前状态 */
    private Integer beforeState;

    /** 更新后状态 */
    private Integer afterState;

    public AlterStateVO() {
    }

    public AlterStateVO(Long activityId, Integer beforeState, Integer afterState) {
        this.activityId = activityId;
        this.beforeState = beforeState;
        this.afterState = afterState;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Integer getBeforeState() {
        return beforeState;
    }

    public void setBeforeState(Integer beforeState) {
        this.beforeState = beforeState;
    }

    public Integer getAfterState() {
        return afterState;
    }

    public void setAfterState(Integer afterState) {
        this.afterState = afterState;
    }

    @Override
    public String toString() {
        return "AlterStateVO{" +
                "activityId=" + activityId +
                ", beforeState=" + beforeState +
                ", afterState=" + afterState +
                '}';
    }

}
