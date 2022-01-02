package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/1
 * Time: 18:54
 * Description: No Description
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001Application.class, args);
        System.out.println("启动成功");
    }
}
