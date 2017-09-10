package com.fly;

import com.fly.config.properties.ProfileProperties;
import com.fly.config.properties.RedisProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 *  SpringBoot 启动类.
 *
 *  继承SpringBootServletInitializer 类，覆盖configure()，把启动类 Application 注册进去。
 *	外部web应用服务器构建Web Application Context的时候，会把启动类添加进去。
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.setProperty("port", "8081");
        SpringApplication.run(Application.class, args);
    }

}
