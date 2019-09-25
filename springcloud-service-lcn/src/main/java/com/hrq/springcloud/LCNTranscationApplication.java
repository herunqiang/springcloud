package com.hrq.springcloud;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 何润强
 * @Date 2019/9/17 17:29
 * @Description 分布式事务服务器启动类
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagerServer
public class LCNTranscationApplication {
    public static void main(String[] args) {
        SpringApplication.run(LCNTranscationApplication.class, args);
    }
}
