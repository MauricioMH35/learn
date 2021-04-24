package com.spring.blog.services.imps;

import com.spring.blog.models.Post;
import com.spring.blog.repositories.BlogRepository;
import com.spring.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImplement implements BlogService {

    @Autowired
    BlogRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Post findById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }
}
