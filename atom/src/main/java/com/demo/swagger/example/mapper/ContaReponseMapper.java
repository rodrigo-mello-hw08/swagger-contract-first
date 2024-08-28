package com.demo.swagger.example.mapper;

import com.demo.swagger.example.domain.Conta;
import org.openapitools.model.ContaResponse;
import org.springframework.stereotype.Component;

@Component
public class ContaReponseMapper {

    public static ContaResponse toResponse(Conta conta) {
        return new ContaResponse()
            .id(conta.getId())
            .numero(conta.getNumero())
            .cpf(conta.getCpf());
    }
}
