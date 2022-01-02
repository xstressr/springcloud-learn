package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/28
 * Time: 15:32
 * Description: No Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzkOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzkOrder80Application.class, args);
        System.out.println("启动成功");

    }
}
