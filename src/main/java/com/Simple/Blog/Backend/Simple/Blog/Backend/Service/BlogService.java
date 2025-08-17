package com.Simple.Blog.Backend.Simple.Blog.Backend.Service;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Repository.BlogRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public void saveBlog(Blog blog, String userName) {
        blogRepository.save(blog);
    }




    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    public Blog findById(ObjectId id) throws Exception {
        return blogRepository.findById(id)
                .orElseThrow(() -> new Exception("Blog not found: " + id));
    }

    public Blog deleteById(ObjectId id) throws Exception {
        Blog blogToDelete = blogRepository.findById(id)
                .orElseThrow(() -> new Exception("Blog not found: " + id));

        blogRepository.deleteById(id);
        return blogToDelete;
    }

    public List<Blog> update( ObjectId id) throws  Exception{
        return Collections.singletonList(blogRepository.findById(id)
                .orElseThrow(() -> new Exception("Blog not found: " + id)));
    }
}
