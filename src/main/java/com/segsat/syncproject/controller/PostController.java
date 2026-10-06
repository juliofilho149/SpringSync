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

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @Operation(
            summary = "Lista todos os posts adicionados pelo JsonPlaceholder",
            description = "Retorna todas as informações do banco de dados"
    )
    @GetMapping("/posts")
    public List<Post> listarPosts(){
        return postRepository.findAll();
    }

    @Operation(
            summary = "Realiza a busca de um ID",
            description = "Retorna um post em específico pelo ID."
    )
    @GetMapping("/posts/{id}")
    public Post buscarPostPeloId(@PathVariable Long id){
        return postRepository.findById(id).orElseThrow(() -> new PostNotFoundException("Post não encontrado"));
    }
}
