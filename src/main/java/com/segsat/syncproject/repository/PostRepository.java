package com.segsat.syncproject.repository;

import com.segsat.syncproject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
