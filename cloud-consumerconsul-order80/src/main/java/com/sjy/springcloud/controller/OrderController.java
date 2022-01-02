package com.sjy.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/28
 * Time: 16:10
 * Description: No Description
 */

@RestController
@RequestMapping("consumer")
public class OrderController {

    // zookeeper服务中心的服务名称
    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/payment/consul")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
