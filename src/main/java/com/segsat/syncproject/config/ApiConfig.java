package com.segsat.syncproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    //Configuração do Swagger, estou definindo o título da página.
    @Bean
    public OpenAPI customApi(){
        return new OpenAPI().info(new Info().title("SyncProject"));

    }
}
