package com.shangke.springbootconf.confing;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author")
@Data
public class Persion {
    private String name;
    private String age;
}
