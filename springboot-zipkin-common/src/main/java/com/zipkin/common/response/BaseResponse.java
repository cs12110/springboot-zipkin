package com.zipkin.common.response;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.List;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:12
 * <p>
 * @since 1.0.0
 */
@Data
public class BaseResponse<T> {

    private int status;

    private T data;

    private List<T> list;

    private long timestamp;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
