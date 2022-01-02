package com.sjy.springcloud.config;

import feign.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/30
 * Time: 9:53
 * Description: No Description
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
