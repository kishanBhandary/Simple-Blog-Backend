package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.BlogService;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Blog")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private UserService userService;


    @PostMapping("/{userName}")
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog,@PathVariable  String userName) {
        blogService.saveBlog(blog,userName);
        return ResponseEntity.ok(blog);
    }

    @GetMapping("/{userName}")
    public ResponseEntity<?> getAllBlog(@PathVariable String userName) {
        User user = userService.findByUserName(userName);
        List<Blog> userAllBlogs = user.getBlogList();
        if(userAllBlogs!=null && !userAllBlogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

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


