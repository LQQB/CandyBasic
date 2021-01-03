package com.candy.basic.enums;

/**
 * @Classname CbMsgEnum
 * @Description 返回类型
 * @Author liqb
 * @Date 2021/1/3 14:21
 */
public enum CbMsgEnum {
    // 通用的错误类型10000开头
    SUCCESS(8,"成功"),
    NO_OBJECT_FOUND(10001,"请求对象不存在"),
    UNKNOWN_ERROR(10002,"未知错误"),
    NO_HANDLER_FOUND(10003,"找不到执行的路径操作"),
    BIND_EXCEPTION_ERROR(10004,"请求参数错误"),
    PARAMETER_VALIDATION_ERROR(10005,"请求参数校验失败");

    private Integer code;

    private String msg;

    CbMsgEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
