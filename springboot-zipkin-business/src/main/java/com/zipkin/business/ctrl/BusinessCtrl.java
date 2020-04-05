package com.zipkin.business.ctrl;

import com.zipkin.business.service.BusinessService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 14:11
 * <p>
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api/biz/")
public class BusinessCtrl {

    @Resource
    private BusinessService businessService;

    @RequestMapping("/createOrder")
    @ResponseBody
    public Object createOrder() {
        return businessService.createOrder();
    }


    @RequestMapping("/cancelOrder/{orderId}")
    @ResponseBody
    public Object cancelOrder(@PathVariable("orderId") String orderId) {
        return businessService.cancelOrder(orderId);
    }

}
