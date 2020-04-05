package com.zipkin.account.service;

import com.zipkin.common.enums.StatusEnum;
import com.zipkin.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 15:50
 * <p>
 * @since 1.0.0
 */
@Slf4j
@Service
public class AccountService {


    public BaseResponse incrCredit(@PathVariable("account") String account, @PathVariable("orderId") String orderId) {
        BaseResponse<String> response = new BaseResponse<>();
        response.setStatus(StatusEnum.SUCCESS.getValue());
        response.setTimestamp(System.currentTimeMillis());
        response.setData("账号:" + account + " 订单:" + orderId + " 增加积分");


        log.info("Function[incrCredit] incr result:{}", response);

        return response;
    }

    public BaseResponse decrCredit(@PathVariable("orderId") String orderId) {
        BaseResponse<String> response = new BaseResponse<>();
        response.setStatus(StatusEnum.SUCCESS.getValue());
        response.setTimestamp(System.currentTimeMillis());
        response.setData(" 订单:" + orderId + " 减少积分");

        log.info("Function[decrCredit] incr result:{}", response);

        return response;
    }
}
