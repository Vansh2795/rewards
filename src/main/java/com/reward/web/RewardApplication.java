package com.reward.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * @author vansh
 *
 */
@SpringBootApplication
public class RewardApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RewardApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RewardApplication.class, args);
    }
}
