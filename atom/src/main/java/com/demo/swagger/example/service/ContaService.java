package com.demo.swagger.example.service;

import com.demo.swagger.example.domain.Conta;
import org.openapitools.model.ContaRequest;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ContaService {

    private static final Random rand = new Random();

    public Conta criarConta(ContaRequest request) {
        return new Conta(rand.nextInt(50), request.getNumero(), request.getCpf());
    }
}
