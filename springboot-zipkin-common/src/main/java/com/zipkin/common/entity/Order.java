package com.zipkin.common.entity;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:22
 * <p>
 * @since 1.0.0
 */
@Data
public class Order {
    private String orderId;
    private String account;
    private BigDecimal price;
    private Date createTime;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
