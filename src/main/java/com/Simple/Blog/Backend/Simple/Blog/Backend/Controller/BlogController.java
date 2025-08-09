package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.BlogService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog) {
        blogService.saveBlog(blog);
        return ResponseEntity.ok(blog);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlog() {
        List<Blog> blogs = blogService.getAllBlogs();
        return ResponseEntity.ok(blogs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable ObjectId id) throws Exception {
        Blog deletedBlog = blogService.deleteById(id);
        return ResponseEntity.ok(deletedBlog);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable ObjectId id) throws Exception {
        Blog findId = blogService.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


