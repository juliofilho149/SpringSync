package com.segsat.syncproject.controller;

import com.segsat.syncproject.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SyncController {

    private final PostService postService;

    public SyncController(PostService postService){
        this.postService = postService;
    }
    //Sumário e a descrição que o Swagger irá exibir na página
    @Operation(
            summary = "Sincroniza os posts do JSONPlaceholder.",
            description = "Consulta os posts disponíveis na API pública JSONPlaceholder e persiste os dados no PostgreSQL. Retorna a quantidade de posts sincronizados."
    )
    @PostMapping("/sync") // Endpoint responsável por iniciar a sincronização dos posts do JSONPlaceholder
    public ResponseEntity<Map<String, Object>> sincronizar(){

        //irá receber a quantidade de 100 por padrão, que é a quantidade fornecida pelo JsonPlaceholder
        int quantidade = postService.sincronizaPost();

        // Retorna uma resposta HTTP 200 com uma mensagem e a quantidade de Posts sincronizados
        return ResponseEntity.ok(
                Map.of("message", "Sincronização Completa", "quantidade", quantidade)
        );
    }

}
