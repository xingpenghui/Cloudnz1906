package com.laoxing.cloud.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 16:49
 */
@Configuration
public class HystrixConfig {

    //配置 服务的实时数据采集 默认的Servlet
    @Bean
    public ServletRegistrationBean createS(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean();
        registrationBean.setServlet(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }
}
