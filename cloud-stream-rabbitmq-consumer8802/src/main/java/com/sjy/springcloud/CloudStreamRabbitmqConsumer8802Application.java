package com.sjy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/2
 * Time: 18:46
 * Description: No Description
 */
@SpringBootApplication
public class CloudStreamRabbitmqConsumer8802Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8802Application.class, args);
        System.out.println("启动成功");
    }
}
