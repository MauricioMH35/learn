package com.spring.blog.utils;

import com.spring.blog.models.Post;
import com.spring.blog.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummtData {

    @Autowired
    BlogRepository repository;

    // Para gerar automaticamente registros no banco de dados
//     @PostConstruct
    public void savePosts() {
        List<Post> posts = new ArrayList<>();

        Post p1 = new Post();
        p1.setTitle("Docker");
        p1.setAuthor("Michelli Brito");
        p1.setPublication(LocalDate.now());
        p1.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        Post p2 = new Post();
        p2.setTitle("Java");
        p2.setAuthor("Michelli Brito");
        p2.setPublication(LocalDate.now());
        p2.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        Post p3 = new Post();
        p3.setTitle("Spring Security");
        p3.setAuthor("Michelli Brito");
        p3.setPublication(LocalDate.now());
        p3.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

        for(Post post : posts) {
            Post postSave = repository.save(post);
            System.out.println(postSave.getId());
        }
    }
}
