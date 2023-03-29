package cn.cactusli.clottery.common;

/**
 * ClassName: Constants
 * Package: cn.cactusli.clottery.common
 * Description:
 *  枚举信息定义
 * @Author 仙人球⁶ᴳ
 * @Create 2023/3/29 14:43
 * @Version 1.0
 * @Github https://github.com/lixuanfengs
 */
public class Constants {


    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001","未知失败"),
        ILLEGAL_PARAMETER("0002","非法参数"),
        INDEX_DUP("0003","主键冲突");

        private String code;
        private String info;

        ResponseCode(String code, String info) {
            this.code = code;
            this.info = info;
        }

        public String getCode() {
            return code;
        }

        public String getInfo() {
            return info;
        }

    }

}
