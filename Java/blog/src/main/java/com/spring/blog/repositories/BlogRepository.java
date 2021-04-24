package com.spring.blog.repositories;

import com.spring.blog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {
}
