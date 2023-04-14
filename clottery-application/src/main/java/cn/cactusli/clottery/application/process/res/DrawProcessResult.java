package cn.cactusli.clottery.application.process.res;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.domain.strategy.model.vo.DrawAwardInfo;

/**
 * ClassName: DrawProcessResult
 * Package: cn.cactusli.clottery.application.process.res
 * Description:
 *  活动抽奖结果
 *
 * @Author 仙人球⁶ᴳ
 * @Create 2023/4/12 11:32
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class DrawProcessResult extends Result {

    private DrawAwardInfo drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
