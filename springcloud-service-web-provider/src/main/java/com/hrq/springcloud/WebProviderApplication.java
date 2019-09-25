package com.hrq.springcloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 何润强
 * @Date 2019/9/17 10:57
 * @Description 接口消费服务启动程序
 **/

@SpringBootApplication(/*exclude= {DataSourceAutoConfiguration.class}*/)//不处理数据源操作
@EnableDiscoveryClient
@EnableFeignClients
//添加熔断降级注解
@EnableCircuitBreaker
//开启熔断器仪表盘监控
@EnableHystrixDashboard
@EnableDistributedTransaction//开启分布式事务
public class WebProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebProviderApplication.class,args);
    }
}
