package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/30
 * Time: 9:49
 * Description: No Description
 */
@SpringBootApplication
@EnableFeignClients //启动feign
public class CloudConsumerFeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80Application.class, args);
        System.out.println("启动成功");
    }
}
