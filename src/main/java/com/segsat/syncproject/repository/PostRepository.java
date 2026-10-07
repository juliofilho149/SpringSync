package com.segsat.syncproject.repository;

import com.segsat.syncproject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
// Interface que herda os métodos do JpaRepository para realizar operações no banco de dados como consultas, inserts, delets e etc...
public interface PostRepository extends JpaRepository<Post, Long> {
}
