package com.segsat.syncproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Operation(
            summary = "Exibe o status do sistema",
            description = "Irá retornar o status do sistema"
    )
    @GetMapping("/health")
    public String health(){
        return "Its ok, i am ok :)";
    }
}
