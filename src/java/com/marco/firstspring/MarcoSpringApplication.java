package com.marco.firstspring;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MarcoSpringApplication {

    // this class will look for the commandline runner anywhere in the code and will start is up.

    public static void main(String[] args) {
        ApplicationContext contexto = new SpringApplicationBuilder(MarcoSpringApplication.class)
                .web(WebApplicationType.NONE)
                .headless(false)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
