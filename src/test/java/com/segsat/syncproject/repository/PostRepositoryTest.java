package com.segsat.syncproject.repository;

import com.segsat.syncproject.model.Post;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    void salvaEConsultaPost(){

        Post post = new Post(
                1L,
                1L,
                "Primeiro post",
                "Olá, meu primeiro post!"
        );

        postRepository.save(post);

        Post encontrado = postRepository.findById(1L).orElse(null);

        Assertions.assertThat(encontrado).isNotNull();
        Assertions.assertThat(encontrado.getId()).isEqualTo(1L);
        Assertions.assertThat(encontrado.getTitle()).isEqualTo("Primeiro post");



    }

}
