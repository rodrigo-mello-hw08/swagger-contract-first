package com.demo.swagger.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Conta {
    private Integer id;
    private String numero;
    private String cpf;
}
