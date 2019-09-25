package com.hrq.springcloud.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
/**
 * @Author 何润强
 * @Date 2019/9/17 10:44
 * @Param
 * @return
 * @Description 熔断仪表盘配置
 **/
@Configuration
public class HystrixDashboardConfiguration {
 
    /**
     * 因为此处springboot里面没有web.xml，所以此处采用代码注册一下servlet
     * servlet的名称是：HystrixMetricsStreamServlet
     * servlet的url为：hystrix.stream
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean( hystrixMetricsStreamServlet );
        servletRegistrationBean.setLoadOnStartup( 1 );
        servletRegistrationBean.addUrlMappings( "/hystrix.stream" );
        servletRegistrationBean.setName( "HystrixMetricsStreamServlet" );
        return  servletRegistrationBean;
    }
}