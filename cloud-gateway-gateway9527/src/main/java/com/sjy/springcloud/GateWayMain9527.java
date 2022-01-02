package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/1
 * Time: 21:23
 * Description: No Description
 */

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
        System.out.println("启动成功");
    }
}
