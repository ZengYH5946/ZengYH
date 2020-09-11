package com.wistron.test.entity;

/**
 * JSON结果封装类 RespBean
 *
 * @author ZengYH
 * @since 2020-06-26 11:39:48
 */
// ("RespBean(JSON结果统一封装)实体类")
public class RespBean {
    // ("状态码")
    private Integer code;
    // ("提示信息")
    private String message;
    // ("数据信息")
    private Object data;

    public static RespBean ok(String message) {
        return new RespBean(200, message, null);
    }

    public static RespBean ok(String message, Object data) {
        return new RespBean(200, message, data);
    }

    public static RespBean error(String message) {
        return new RespBean(500, message, null);
    }

    public static RespBean error(String message, Object data) {
        return new RespBean(500, message, data);
    }

    private RespBean(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}