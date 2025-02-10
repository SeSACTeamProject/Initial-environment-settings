package com.example.sesac_project.config;

import com.example.sesac_project.converter.IpToStringConverter;
import com.example.sesac_project.converter.StringToIpConverter;
import com.example.sesac_project.formatter.FormatEx;
import com.example.sesac_project.interceptor.ExInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ExInterceptor());
    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
        WebMvcConfigurer.super.addFormatters(registry);
        registry.addConverter(new IpToStringConverter());
        registry.addConverter(new StringToIpConverter());
        registry.addFormatter(new FormatEx());
    }
}
