package com.hrq.springcloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author 何润强
 * @Date 2019/9/16 15:11
 * @Description eureka客户端启动类
 **/
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.hrq.springcloud")
@MapperScan(value = {"classpath:mapperconfig/*.xml","com.hrq.springcloud.mapper"})
@EnableDistributedTransaction//开启分布式事务
@EnableCaching//开启缓存
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
