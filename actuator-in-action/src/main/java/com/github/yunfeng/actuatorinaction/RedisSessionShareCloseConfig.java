package com.github.yunfeng.actuatorinaction;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.session.web.http.SessionRepositoryFilter;

@Configuration

public class RedisSessionShareCloseConfig {

    @Bean
    public FilterRegistrationBean<SessionRepositoryFilter<?>> sessionFilter(SessionRepositoryFilter<?> sessionRepositoryFilter) {
        FilterRegistrationBean<SessionRepositoryFilter<?>> r = new FilterRegistrationBean<>();
        r.setFilter(sessionRepositoryFilter);
        r.addUrlPatterns("/*");
        r.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return r;
    }
}