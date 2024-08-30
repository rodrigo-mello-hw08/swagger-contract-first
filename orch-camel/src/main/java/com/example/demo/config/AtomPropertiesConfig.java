package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties
@Configuration
public class AtomPropertiesConfig {

    @Value("${endpoints.atom.base}")
    private String base;

    @Value("${endpoints.atom.criarConta}")
    private String criarConta;
}
