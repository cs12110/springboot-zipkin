package com.zipkin.order.service;

import com.zipkin.common.entity.Order;
import com.zipkin.common.enums.StatusEnum;
import com.zipkin.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:22
 * <p>
 * @since 1.0.0
 */
@Service
@Slf4j
public class OrderService {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service.account.url}")
    private String accountServiceUrl;


    public BaseResponse create(Order order) {
        BaseResponse<Order> baseResponse = new BaseResponse<>();
        baseResponse.setData(order);
        baseResponse.setStatus(StatusEnum.SUCCESS.getValue());
        baseResponse.setTimestamp(System.currentTimeMillis());


        log.info("Function[create] order:{}", order);

        String url = accountServiceUrl + "incrCredit/" + order.getAccount() + "/" + order.getOrderId();
        ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);


        log.info("Function[create] account result:{}", result.getBody());

        return baseResponse;
    }


    public BaseResponse cancel(String orderId) {
        BaseResponse<String> baseResponse = new BaseResponse<>();
        baseResponse.setData("取消订单:" + orderId);
        baseResponse.setStatus(StatusEnum.SUCCESS.getValue());
        baseResponse.setTimestamp(System.currentTimeMillis());


        log.info("Function[cancel] order:{}", orderId);

        String url = accountServiceUrl + "decrCredit/" + orderId;
        ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);


        log.info("Function[create] account result:{}", result.getBody());

        return baseResponse;
    }

}
