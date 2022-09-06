package com.hogrider.config;


import com.hogrider.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplicationConfig {

    //定义方法：注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){

        //public ServletRegistrationBean(T servlet, String... urlMappings)
        // 使用两个参数的
        //ServletRegistrationBean bean = new ServletRegistrationBean( new MyServlet(), "/myservlet" );

        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet( new MyServlet());
        bean.addUrlMappings("/login", "/test");



        return bean;
    }

}
