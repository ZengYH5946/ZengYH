package com.wistron.test.entity;

import lombok.Data;

/**
 *JSON结果封装类 RespBean
 *
 * @author ZengYH
 * @since 2020-06-26 11:39:48
 */
@Data
public class RespBean {
	/*
	 * @ApiModelProperty("状态码")
	 */
    private Integer code;
	/*
	 * @ApiModelProperty("提示信息")
	 */
    private String message;
	/*
	 * @ApiModelProperty("数据信息")
	 */
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
    
}