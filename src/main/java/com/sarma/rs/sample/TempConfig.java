package com.sarma.rs.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
public class TempConfig implements InitializingBean,
        DisposableBean {

    public TempConfig() {
        log.info("I am in Temp Config Constructor ");
    }

    @Bean
    @Primary
    public calculator defaultCalculator() {
        return new BasicCalculator();
    }

    @Bean
    @Scope("prototype")
    public calculator secondaryCalculator() {
        return new ScientificCalculator();
    }

    @PostConstruct
    public void handleThis() {
        log.info("I am in Temp Config Post Construct method");
    }

    @Override
    public void destroy() throws Exception {
        log.info("I am in Temp Config Destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("I am in Temp Config After Properties method");
    }
}
