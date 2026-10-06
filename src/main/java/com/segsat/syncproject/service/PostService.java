package com.segsat.syncproject.service;


import com.segsat.syncproject.client.JsonPlaceholderClient;
import com.segsat.syncproject.model.Post;
import com.segsat.syncproject.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final JsonPlaceholderClient json;

    public PostService(PostRepository postRepository, JsonPlaceholderClient json){
        this.postRepository = postRepository;
        this.json = json;
    }

    public int sincronizaPost(){
        List<Post> posts = json.buscarPosts();
        postRepository.saveAll(posts);
        return posts.size();
    }

}
