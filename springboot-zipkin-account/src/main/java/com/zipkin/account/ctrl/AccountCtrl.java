package com.zipkin.account.ctrl;

import com.zipkin.account.service.AccountService;
import com.zipkin.common.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author cs12110 create at 2020-04-05 15:50
 * <p>
 * @since 1.0.0
 */
@Controller
@RequestMapping("/api/account")

public class AccountCtrl {

    @Resource
    private AccountService accountService;

    @RequestMapping("/incrCredit/{account}/{orderId}")
    @ResponseBody
    public BaseResponse incrCredit(@PathVariable("account") String account, @PathVariable("orderId") String orderId) {
        return accountService.incrCredit(account, orderId);
    }

    @RequestMapping("/decrCredit/{orderId}")
    @ResponseBody
    public BaseResponse decrCredit(@PathVariable("orderId") String orderId) {
        return accountService.decrCredit(orderId);
    }
}
