package com.sjy.springcloud;

import com.sjy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/25
 * Time: 17:15
 * Description: No Description
 */

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class) // 启动该服务时去加载自定义的ribbon配置
public class CloudConsumerOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
        System.out.println("启动成功");
    }
}
