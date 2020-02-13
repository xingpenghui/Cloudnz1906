package com.laoxing.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: Cloudnz1906
 * @description:
 * @author: Feri
 * @create: 2020-02-13 11:45
 */
@SpringBootApplication
@EnableSwagger2 //启用Swagger
@EnableDiscoveryClient //发现服务
@EnableFeignClients //启用Feign
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
