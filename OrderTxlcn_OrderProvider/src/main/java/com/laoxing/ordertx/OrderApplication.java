package com.laoxing.ordertx;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 16:07
 */
@SpringBootApplication
@MapperScan("com.laoxing.ordertx.dao") //扫描dao
@EnableDiscoveryClient //注册和发现服务
@EnableFeignClients //启用Feign
@EnableSwagger2
@EnableDistributedTransaction
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
