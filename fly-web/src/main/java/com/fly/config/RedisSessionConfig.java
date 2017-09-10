package com.fly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.util.Properties;

/**
 *  通过加上@EnableRedisHttpSession注解，开启redis集中式session管理，所有的session都存放到了redis中
 *  maxInactiveIntervalInSeconds 配置session 失效时间
 * **/
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class RedisSessionConfig {


}
