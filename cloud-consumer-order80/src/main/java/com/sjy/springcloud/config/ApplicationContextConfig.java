package com.sjy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/25
 * Time: 20:15
 * Description: No Description
 */
@Configuration
public class ApplicationContextConfig {

    // 配置bean 不然后面没法依赖注入，就像以前ssm整合时配置依赖注入一样，
    // 需要在配置文件配置之后，代码中才可以依赖注入
    // 当前文件就是spring的配置文件
    @Bean
//    @LoadBalanced
    //    @LoadBalanced //让这个RestTemplate在请求时拥有客户端负载均衡的能力  //将此注解注释掉，使用自己的轮询算法不使用默认的
    public RestTemplate getRestTamplate() {
        return new RestTemplate();
    }
}
