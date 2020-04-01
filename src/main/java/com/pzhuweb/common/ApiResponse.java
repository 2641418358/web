package com.pzhuweb.common;

import lombok.Data;

import java.util.HashMap;

/**
 * 响应数据
 */
@Data
public class ApiResponse<T> extends HashMap<String, Object> {


    private Integer success;

    private T data;


    /**
     * 只需要状态码
     * @param success
     * @return
     */
    public ApiResponse success(Integer success){

        this.put("success", success);

        return this;
    }

    /**
     * 只需要数据
     * @param data
     * @return
     */
    public ApiResponse data(T data){

        this.put("data", data);

        return this;
    }


    @Override
    public Object put(String key, Object value) {

        super.put(key, value);

        return this;
    }
}
