package com.example.demo.repository;

import com.example.demo.config.AtomPropertiesConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.model.ContaRequest;
import org.openapitools.model.ContaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ContaRepository {

    @Autowired
    private RestTemplate template;

    @Autowired
    private AtomPropertiesConfig propertiesConfig;

    public ContaResponse criarConta(ContaRequest request) throws JsonProcessingException {
        String url = propertiesConfig.getBase().concat(propertiesConfig.getCriarConta());
        HttpEntity<Object> entity = new HttpEntity(converterParaJson(request), construirHeader());
        ResponseEntity<ContaResponse> resposta = template.postForEntity(url, entity, ContaResponse.class);
        return resposta.getBody();
    }

    private String converterParaJson(ContaRequest request) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(request);
    }

    private HttpHeaders construirHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
