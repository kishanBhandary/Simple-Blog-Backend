package com.Simple.Blog.Backend.Simple.Blog.Backend.Service;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Repository.BlogRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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
    public   Blog deleteBYID( ObjectId id) throws Exception {
        Optional<Blog> existingBlog = blogRepository.findById(id);
        if (existingBlog.isPresent()) {
            return blogRepository.deleteBYID(id);

        } else {
            throw new Exception("User not found:" + id);
        }

    }
}
