package com.zipkin.business.service;

import com.zipkin.common.entity.Order;
import com.zipkin.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:15
 * <p>
 * @since 1.0.0
 */
@Service
@Slf4j
public class BusinessService {

    @Value("${service.order.url}")
    private String orderServiceUrl;


    @Resource
    private RestTemplate restTemplate;

    public BaseResponse createOrder() {

        Order newOrder = new Order();
        newOrder.setOrderId("O" + System.currentTimeMillis());
        newOrder.setAccount("cs12110");
        newOrder.setPrice(BigDecimal.valueOf(1024.00));
        newOrder.setCreateTime(new Date());


        String createUrl = orderServiceUrl + "/create";
        ResponseEntity<BaseResponse> result = restTemplate.postForEntity(createUrl, newOrder, BaseResponse.class);


        log.info("Function[createOrder] result:{}", result.getBody());


        return result.getBody();
    }


    public BaseResponse cancelOrder(String orderId) {


        String createUrl = orderServiceUrl + "/cancel/" + orderId;
        ResponseEntity<BaseResponse> result = restTemplate.getForEntity(createUrl, BaseResponse.class);


        log.info("Function[cancelOrder] result:{}", result.getBody());


        return result.getBody();
    }
}
