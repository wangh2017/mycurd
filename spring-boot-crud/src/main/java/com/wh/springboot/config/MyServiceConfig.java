package com.wh.springboot.config;

import com.wh.springboot.filter.MyFilter;
import com.wh.springboot.listener.MyListener;
import com.wh.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import java.util.Arrays;

@Configuration
public class MyServiceConfig {

    //注册三大组件

    @Bean
    public ServletRegistrationBean myServlet(){

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return registrationBean;

    }

    @Bean
    public ServletListenerRegistrationBean myListener(){

        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new MyListener());

        return servletListenerRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){

        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();

        filterRegistration.setFilter(new MyFilter());

        filterRegistration.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterRegistration;
    }

}
