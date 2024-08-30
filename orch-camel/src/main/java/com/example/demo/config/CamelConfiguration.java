package com.example.demo.config;

import com.example.demo.camel.CamelContextWrapper;
import com.example.demo.camel.ContaRouter;
import com.example.demo.repository.ContaRepository;
import com.example.demo.service.CriarContaService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CamelConfiguration {

    @Bean
    public CamelContextWrapper camelContextWrapper(RouteBuilder... routes) throws Exception {
        return new CamelContextWrapper(routes);
    }

    @Bean
    public ContaRouter contaRouter(ContaRepository contaRepository) {
        return new ContaRouter(contaRepository);
    }

    @Bean
    public CriarContaService criarContaService(CamelContextWrapper camelContextWrapper) {
        return new CriarContaService(camelContextWrapper);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
