package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/26
 * Time: 15:53
 * Description: No Description
 */
@SpringBootApplication
@EnableEurekaServer //设置为服务注册中心 EurekaServer
public class CloudEurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
        System.out.println("启动成功");
    }
}
