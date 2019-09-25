package com.hrq.springcloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author 何润强
 * @Date 2019/9/17 17:05
 * @Description 服务生产者启动程序B
 **/
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.hrq.springcloud")
@MapperScan(value = {"classpath:mapperconfig/*.xml","com.hrq.springcloud.mapper"})

@EnableDistributedTransaction//开启分布式事务
public class ProviderApplicationB {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationB.class, args);
    }
}
