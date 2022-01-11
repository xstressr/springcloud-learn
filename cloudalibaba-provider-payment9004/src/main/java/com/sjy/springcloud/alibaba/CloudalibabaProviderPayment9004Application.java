package com.sjy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/6
 * Time: 13:37
 * Description: No Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9004Application.class, args);
        System.out.println("启动成功");
    }
}
