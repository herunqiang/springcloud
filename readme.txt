涉及技术点：
分布式和微服务

启动注意事项：
1.springcloud-service-eureka 》》springcloud-service-lcn》》生产者》》消费者

项目说明：
pommanagement:管理一些公共的依赖
springcloud-service-eureka:服务注册中心
springcloud-service-lcn:分布式事务服务端
springcloud-service-provider:服务生产者（被调用方）
springcloud-service-provider-b:服务生产者b（被调用方）
springcloud-service-web-provider:系统web层，主要负责系统服务的负载均衡（可以自定义）。
springcloud-service-common:公共模块和其他模块没关系（主要用于公共测试练习使用）

