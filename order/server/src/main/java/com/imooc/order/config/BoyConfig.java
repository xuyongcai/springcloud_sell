package com.imooc.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("boy")
//只有加"@RefreshScope"，才能将配置中心拉回来的配置文件自动刷新，很重要
@RefreshScope
public class BoyConfig {

    private String name;

    private Integer age;
}
