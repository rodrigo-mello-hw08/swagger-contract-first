package com.example.demo.camel;

import com.example.demo.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

@AllArgsConstructor
public class ContaRouter extends RouteBuilder {
    public static final String ROUTE_CRIAR_CONTA = "direct:criarConta";

    private final ContaRepository contaRepository;

    @Override
    public void configure() throws Exception {
        from(ROUTE_CRIAR_CONTA)
            .log("Chamando criacao de conta")
            .bean(contaRepository, "criarConta")
            .end();
    }
}
