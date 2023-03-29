package cn.cactusli.clottery.common;

import java.io.Serializable;

/**
 * ClassName: Result
 * Package: cn.cactusli.clottery.common
 * Description:
 *  统一返回对象中，Code码、Info描述
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:42
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String info;

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult() {
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult() {
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
