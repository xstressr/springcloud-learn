package com.sjy.springcloud.controller;

import com.sjy.springcloud.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/2
 * Time: 18:33
 * Description: No Description
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProviderService.send();
    }
}
