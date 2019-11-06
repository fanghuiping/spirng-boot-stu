package com.shangke.springbootconf;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/peiZhi.xml"})
public class SpringBootConfApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootConfApplication.class);
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
    }

}
