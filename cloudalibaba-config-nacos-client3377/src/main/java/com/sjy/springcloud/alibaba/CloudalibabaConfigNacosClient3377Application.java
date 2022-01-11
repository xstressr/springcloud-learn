package com.sjy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/3
 * Time: 15:42
 * Description: No Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377Application.class, args);
        System.out.println("启动成功");
    }
}
