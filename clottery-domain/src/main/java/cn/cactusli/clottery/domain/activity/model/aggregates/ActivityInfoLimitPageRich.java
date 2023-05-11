package cn.cactusli.clottery.domain.activity.model.aggregates;

import cn.cactusli.clottery.domain.activity.model.vo.ActivityVO;

import java.util.List;

/**
 * Package: cn.cactusli.clottery.domain.activity.model.aggregates
 * Description:
 *  活动分页查询聚合对象
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 9:54
 * @Github https://github.com/lixuanfengs
 */
public class ActivityInfoLimitPageRich {

    private Long count;
    private List<ActivityVO> activityVOList;

    public ActivityInfoLimitPageRich() {
    }

    public ActivityInfoLimitPageRich(Long count, List<ActivityVO> activityVOList) {
        this.count = count;
        this.activityVOList = activityVOList;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<ActivityVO> getActivityVOList() {
        return activityVOList;
    }

    public void setActivityVOList(List<ActivityVO> activityVOList) {
        this.activityVOList = activityVOList;
    }

}
