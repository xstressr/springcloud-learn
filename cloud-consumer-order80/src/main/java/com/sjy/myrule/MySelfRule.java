package com.sjy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/28
 * Time: 19:08
 * Description: No Description
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 此处将Ribbon默认使用的轮询策略改为随机策略
        return new RandomRule();
    }
}
