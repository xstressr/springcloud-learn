package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/2
 * Time: 13:58
 * Description: No Description
 */
@SpringBootApplication
@EnableConfigServer
//@ServletComponentScan("com.sjy.springcloud.filter")
public class CloudConfigCenter3344Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class, args);
        System.out.println("启动成功");
    }
}
