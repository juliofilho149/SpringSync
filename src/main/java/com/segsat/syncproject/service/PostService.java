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

    //Construtor Responsável de herdar metodos necessários para o serviço abaixo
    public PostService(PostRepository postRepository, JsonPlaceholderClient json){
        this.postRepository = postRepository;
        this.json = json;
    }
    //metodo responsável por sincronizar os POSTS da API com o banco de dados
    public int sincronizaPost(){
        List<Post> posts = json.buscarPosts(); //Busca os Posts na API JsonPlaceHolder
        postRepository.saveAll(posts);//salva os Posts no banco de dados
        return posts.size();//Retorna a quantidade de posts salvos.
    }

}
