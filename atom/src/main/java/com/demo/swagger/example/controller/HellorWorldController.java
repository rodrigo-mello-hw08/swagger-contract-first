package com.demo.swagger.example.controller;

import org.openapitools.api.HelloworldApi;
import org.openapitools.model.RespostaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("helloworld")
public class HellorWorldController implements HelloworldApi {

    @GetMapping
    @Override
    public ResponseEntity<RespostaResponse> helloworldola(@RequestParam String nome) {
        RespostaResponse response = new RespostaResponse().texto("Olá, " + nome);
        return ResponseEntity.ok(response);
    }

}
