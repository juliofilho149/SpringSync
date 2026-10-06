package com.segsat.syncproject.controller;


import com.segsat.syncproject.exception.GlobalExceptionHandler;
import com.segsat.syncproject.model.Post;
import com.segsat.syncproject.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PostController.class)
@Import(GlobalExceptionHandler.class)
public class PostControllerTest{

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private PostRepository postRepository;

    @Test
    void PostNaoExiste() throws Exception{

        Post post = new Post(
                1L,
                1L,
                "Primeiro post",
                "Olá, meu primeiro post!"

        );
    }
    @Test
    void PostNaoExiste404() throws Exception{

        when(postRepository.findById(999L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/posts/999")).andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("Post não encontrado"));
    }

}