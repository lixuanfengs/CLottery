package cn.cactusli.clottery.rpc.deploy.res;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.rpc.deploy.dto.ActivityDTO;

import java.io.Serializable;
import java.util.List;

/**
 * Package: cn.cactusli.clottery.rpc.deploy.res
 * Description:
 *  活动查询结果
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/5/8 9:46
 * @Github https://github.com/lixuanfengs
 */
public class DeployActivityRes implements Serializable {


    private Result result;
    private Long count;
    private List<ActivityDTO> activityDTOList;

    public DeployActivityRes() {
    }

    public DeployActivityRes(Result result) {
        this.result = result;
    }

    public DeployActivityRes(Result result, Long count, List<ActivityDTO> activityDTOList) {
        this.result = result;
        this.count = count;
        this.activityDTOList = activityDTOList;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<ActivityDTO> getActivityDTOList() {
        return activityDTOList;
    }

    public void setActivityDTOList(List<ActivityDTO> activityDTOList) {
        this.activityDTOList = activityDTOList;
    }
}
