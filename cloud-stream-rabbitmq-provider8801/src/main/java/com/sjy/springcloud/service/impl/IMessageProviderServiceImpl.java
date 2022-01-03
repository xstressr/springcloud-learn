package com.sjy.springcloud.service.impl;

import com.sjy.springcloud.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/2
 * Time: 18:33
 * Description: No Description
 */
@EnableBinding(Source.class)
public class IMessageProviderServiceImpl implements IMessageProviderService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);

        System.out.println("*****serial: " + serial);
        return serial;
    }
}
