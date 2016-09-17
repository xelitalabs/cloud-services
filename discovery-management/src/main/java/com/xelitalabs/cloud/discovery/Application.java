package com.xelitalabs.cloud.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main application class.
 *
 * @author xelita
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Value("${spring.application.name}")
    public String appKey;

    @Value("${info.build.version}")
    public String buildVersion;

    // *************************************************************************
    //
    // Launcher
    //
    // *************************************************************************

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder().sources(Application.class).run(args);
    }

    // *************************************************************************
    //
    // Methods from CommandLineRunner interface
    //
    // *************************************************************************

    @Override
    public void run(String... strings) throws Exception {
        log.info("application {} is available for use.", this.appKey);
    }
}
