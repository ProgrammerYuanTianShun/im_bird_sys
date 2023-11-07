package org.luminary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author YuanTianShun
 */
@ComponentScan(basePackages = {"org.luminary","org.n3r.idworker"})
@SpringBootApplication
public class ImBirdSysApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ImBirdSysApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ImBirdSysApplication.class, args);
    }

}
