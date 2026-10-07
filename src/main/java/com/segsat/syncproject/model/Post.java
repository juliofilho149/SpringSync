package com.segsat.syncproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Criação da tabela que irá receber os posts e retornar os gets
@Entity
@Table(name = "posts") //nome da tabela
public class Post {

    @Id //definindo o Id, não adicionei o @GeneratedValue pois a API REST não irá ser responsável por adicionar novos posts, eles virão do JsonPlaceholder
    private Long id;

    private Long userId; //Definindo o restante das colunas

    private String title;

    private String body;

    public Post(){
    }
    // Construtor utilizado para criar um Post com todas as informações
    public Post(Long id,Long userId,String title, String body) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    //Geters e Seters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
