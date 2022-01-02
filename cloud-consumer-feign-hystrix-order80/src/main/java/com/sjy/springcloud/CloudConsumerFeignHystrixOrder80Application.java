package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/30
 * Time: 15:39
 * Description: No Description
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class, args);
        System.out.println("启动成功");
    }
}
