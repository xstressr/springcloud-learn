package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/28
 * Time: 15:18
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class CloudProviderPayment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8004Application.class, args);
        System.out.println("启动成功");
    }
}
