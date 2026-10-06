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

    @Operation(
            summary = "Executa o preenchimento do banco de dados",
            description = "Insere o total de 100 posts no banco de dados"
    )
    @PostMapping("/sync")
    public ResponseEntity<Map<String, Object>> sincronizar(){

        int quantidade =postService.sincronizaPost();

        return ResponseEntity.ok(
                Map.of("message", "Sincronização Completa", "quantidade", quantidade)
        );
    }

}
