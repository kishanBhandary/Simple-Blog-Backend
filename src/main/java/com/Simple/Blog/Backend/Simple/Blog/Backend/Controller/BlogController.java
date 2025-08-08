package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.BlogService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping
    public void addBlog(@RequestBody Blog blog){
         blogService.saveBlog(blog);
    }
    @GetMapping
    public void getAllBlog(Blog blog){
        blogService.getBlog(blog);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Blog> deleteBlog(@RequestBody Blog blog, @PathVariable ObjectId id) throws Exception {
        blogService.
        if(existingBlog == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        blogService.deleteBYID(id);

    }

}
