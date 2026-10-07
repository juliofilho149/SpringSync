package com.segsat.syncproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe responsável pelo Health da api
@RestController
public class HealthController {
    //Configuração do Swagger que irá ser exibida na página
    @Operation(
            summary = "Exibe o status do sistema",
            description = "Retornar o status do sistema"
    )
    //O retorno que /health trará ao ser consultado
    @GetMapping("/health")
    public String health(){
        return "Its ok, i am ok :)";
    }
}
