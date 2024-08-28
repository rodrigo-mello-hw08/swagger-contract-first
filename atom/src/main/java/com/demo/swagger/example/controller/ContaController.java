package com.demo.swagger.example.controller;

import com.demo.swagger.example.domain.Conta;
import com.demo.swagger.example.mapper.ContaReponseMapper;
import com.demo.swagger.example.service.ContaService;
import org.openapitools.api.ContaApi;
import org.openapitools.model.ContaRequest;
import org.openapitools.model.ContaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContaController implements ContaApi {

    @Autowired
    private ContaService contaService;

    @Override
    public ResponseEntity<ContaResponse> criarConta(@RequestBody ContaRequest contaRequest) {
        Conta conta = contaService.criarConta(contaRequest);
        ContaResponse response = ContaReponseMapper.toResponse(conta);
        return ResponseEntity.ok(response);
    }

}
