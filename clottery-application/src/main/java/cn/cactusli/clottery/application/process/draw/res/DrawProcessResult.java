package cn.cactusli.clottery.application.process.draw.res;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.domain.strategy.model.vo.DrawAwardVO;

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

    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVo() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }
}
