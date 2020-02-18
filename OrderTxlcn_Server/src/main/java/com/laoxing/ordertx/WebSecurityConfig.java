package com.laoxing.ordertx;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: Order_Txlcn
 * @description: 启用Spring Security 的拦截
 * @author: Feri
 * @create: 2020-02-18 14:48
 */
@EnableWebSecurity //
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //配置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
