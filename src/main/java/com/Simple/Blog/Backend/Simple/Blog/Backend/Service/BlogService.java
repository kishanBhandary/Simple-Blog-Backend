package com.Simple.Blog.Backend.Simple.Blog.Backend.Service;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BlogService {
    @Autowired
     private BlogRepository blogRepository;

    public void saveBlog(Blog blog){
        blogRepository.save(blog);
    }
    public List<Blog> getBlog(Blog blog){
        return blogRepository.findAll();
    }


}
