package com.sjy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2021/12/28
 * Time: 20:41
 * Description: No Description
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {
    //原子类
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        String a = "current";
        int next = 0;
        do {
            current = atomicInteger.get();
            //防止越界
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while(!atomicInteger.compareAndSet(current, next));
        System.out.println("*****第几次访问，次数next: " + next);
        return next;
    }


    /**
     * 负载均衡算法：rest接口第几次请求书 % 服务器集群总数量 = 实际调用服务器位置下标， 每次服务重启后rest接口计数从1开始
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
