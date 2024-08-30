package com.example.demo.controller;

import com.example.demo.service.CriarContaService;
import org.openapitools.api.ContaApi;
import org.openapitools.model.ContaRequest;
import org.openapitools.model.ContaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController implements ContaApi {

    @Autowired
    private CriarContaService criarContaService;

    @Override
    public ResponseEntity<ContaResponse> criarConta(ContaRequest contaRequest) {
        return ResponseEntity.ok(criarContaService.criarConta(contaRequest));
    }

}
