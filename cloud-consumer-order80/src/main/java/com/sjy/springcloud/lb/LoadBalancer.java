package com.sjy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author xstress
 * @description 创建自己的负载均衡接口
 */

public interface LoadBalancer {

    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
