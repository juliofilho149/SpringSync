package com.segsat.syncproject.client;

import com.segsat.syncproject.model.Post;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;

@Component
public class JsonPlaceholderClient {

    private final RestClient restClient;

    public JsonPlaceholderClient(){
        this.restClient = RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public List<Post> buscarPosts(){
        Post[] posts = restClient
                .get()
                .uri("/posts")
                .retrieve()
                .body(Post[].class);
        return posts != null
                ? Arrays.asList(posts)
                : List.of();
    }

}
