package cn.cactusli.clottery.rpc.booth.res;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.rpc.booth.dto.ActivityDto;

import java.io.Serializable;

/**
 * ClassName: ActivityRes
 * Package: cn.cactusli.clottery.rpc.res
 * Description:
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:41
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class ActivityRes implements Serializable {

    private Result result;
    private ActivityDto activity;

    public ActivityRes() {
    }

    public ActivityRes(Result result) {
        this.result = result;
    }

    public ActivityRes(Result result, ActivityDto activity) {
        this.result = result;
        this.activity = activity;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public ActivityDto getActivity() {
        return activity;
    }

    public void setActivity(ActivityDto activity) {
        this.activity = activity;
    }
}
