package com.sjy.springcloud.service.impl;

import com.sjy.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/30
 * Time: 16:26
 * Description: No Description
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
