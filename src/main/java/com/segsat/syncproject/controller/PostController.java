package com.segsat.syncproject.controller;

import com.segsat.syncproject.exception.PostNotFoundException;
import com.segsat.syncproject.model.Post;
import com.segsat.syncproject.repository.PostRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    //PostRepository é uma interface que herdou o JpaRepository, assim, ganhando metodos para realizar alterações em tabelas de banco de dados.
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    //Sumário e a descrição que o Swagger irá exibir na página
    @Operation(
            summary = "Lista todos os posts.",
            description = "Retorna todos os posts armazenados no banco de dados PostgreSQL."
    )
    @GetMapping("/posts")//Esse GetMapping irá retornar todos os posts adicionados ao banco de dados.
    public List<Post> listarPosts(){
        return postRepository.findAll();
    }

    //Sumário e a descrição que o Swagger irá exibir na página
    @Operation(
            summary = "Busca um post por ID.",
            description = "Retorna um post específico armazenado no banco de dados a partir do seu ID. Caso o post não seja encontrado, retorna HTTP 404."
    )
    @GetMapping("/posts/{id}") //Esse GetMapping irá retornar um post de um Id específico, ou irá retornar "Post não encontrado" caso o Id não exista.
    public Post buscarPostPeloId(@PathVariable Long id){
        return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado"));
    }
}
