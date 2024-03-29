package com.shangke.springbootbanner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootBannerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootBannerApplication.class);
        /*
         * Mode.OFF:关闭;
         * Mode.CONSOLE:控制台输出，默认方式;
         * Mode.LOG:日志输出方式;
         */
        application.setBannerMode(Banner.Mode.CONSOLE);
        application.run(args);
        log.info("====log===");
    }

}
