package com.segsat.syncproject.controller;

import com.segsat.syncproject.model.Post;
import com.segsat.syncproject.repository.PostRepository;
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

    @GetMapping("/posts")
    public List<Post> listarPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{id}")
    public Post buscarPostPeloId(@PathVariable Long id){
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post não encontrado"));
    }
}
