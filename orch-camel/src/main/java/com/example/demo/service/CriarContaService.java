package com.example.demo.service;

import com.example.demo.camel.CamelContextWrapper;
import com.example.demo.camel.ContaRouter;
import org.apache.camel.ProducerTemplate;
import org.openapitools.model.ContaRequest;
import org.openapitools.model.ContaResponse;
import org.springframework.stereotype.Service;

@Service
public class CriarContaService {

    private final ProducerTemplate template;

    public CriarContaService(CamelContextWrapper wrapper) {
        this.template = wrapper.createProducerTemplate();
    }

    public ContaResponse criarConta(ContaRequest contaRequest) {
        return template.requestBody(ContaRouter.ROUTE_CRIAR_CONTA, contaRequest, ContaResponse.class);
    }
}
