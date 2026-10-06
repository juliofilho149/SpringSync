package com.segsat.syncproject.PostRepositoryTest;

import com.segsat.syncproject.model.Post;
import com.segsat.syncproject.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
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

        assertThat(encontrado).isNotNull();
        assertThat(encontrado.getId()).isEqualTo(1L);
        assertThat(encontrado.getTitle()).isEqualTo("Olá, meu primeiro post!");



    }

}
