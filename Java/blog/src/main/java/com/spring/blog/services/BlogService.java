package com.spring.blog.services;

import com.spring.blog.models.Post;

import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
