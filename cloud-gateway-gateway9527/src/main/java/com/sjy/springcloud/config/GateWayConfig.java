package com.sjy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/1
 * Time: 21:50
 * Description: No Description
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_sjy",r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return  routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_sjy2",r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return  routes.build();
    }
}
