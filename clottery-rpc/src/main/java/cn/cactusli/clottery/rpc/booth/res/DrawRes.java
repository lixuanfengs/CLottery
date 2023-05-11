package cn.cactusli.clottery.rpc.booth.res;

import cn.cactusli.clottery.common.Result;
import cn.cactusli.clottery.rpc.booth.dto.AwardDTO;

import java.io.Serializable;

/**
 * Package: cn.cactusli.clottery.rpc.res
 * Description:
 *  抽奖结果
 *
 * @Author 仙人球⁶ᴳ | 微信：Cactusesli
 * @Date 2023/4/24 10:23
 * @Github https://github.com/lixuanfengs
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO) {
        this.awardDTO = awardDTO;
    }
}
