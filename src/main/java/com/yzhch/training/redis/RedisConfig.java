package com.yzhch.training.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 *@author yzhch
 *@data 2020/5/14 10:32
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig {
    private String host;
    private int port;
    private int timeout;
    private String password;
    private int maxActive;
    private int maxIdle;
    private int maxWait;
}
