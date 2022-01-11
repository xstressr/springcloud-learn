package com.sjy.springcloud.alibaba.service;

import entities.CommonResult;
import entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/6
 * Time: 13:53
 * Description: No Description
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
