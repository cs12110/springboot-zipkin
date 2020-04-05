package com.zipkin.order.ctrl;

import com.zipkin.common.entity.Order;
import com.zipkin.common.response.BaseResponse;
import com.zipkin.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:38
 * <p>
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api/order")
@Slf4j
public class OrderCtrl {

    @Resource
    private OrderService orderService;

    @RequestMapping("/create")
    @ResponseBody
    public BaseResponse create(@RequestBody Order order) {
        return orderService.create(order);
    }

    @RequestMapping("/cancel/{orderId}")
    @ResponseBody
    public BaseResponse cancel(@PathVariable("orderId") String orderId) {
        return orderService.cancel(orderId);
    }

}
