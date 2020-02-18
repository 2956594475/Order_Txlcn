package com.laoxing.ordertx;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Order_Txlcn
 * @description:
 * @author: Feri
 * @create: 2020-02-18 15:58
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.laoxing.ordertx.dao")
@EnableDistributedTransaction
public class RepositoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepositoryApplication.class,args);
    }
}
