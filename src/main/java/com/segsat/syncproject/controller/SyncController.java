package com.segsat.syncproject.controller;

import com.segsat.syncproject.service.PostService;
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

    @PostMapping("/sync")
    public ResponseEntity<Map<String, Object>> sincronizar(){

        int quantidade =postService.sincronizaPost();

        return ResponseEntity.ok(
                Map.of(
                        "message", "Sicronização Compelta",
                        "quatidade", quantidade
                )
        );
    }

}
