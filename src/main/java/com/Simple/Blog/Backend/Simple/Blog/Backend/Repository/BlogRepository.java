package com.Simple.Blog.Backend.Simple.Blog.Backend.Repository;


import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.Blog;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.plaf.basic.BasicLookAndFeel;

public interface BlogRepository extends MongoRepository<Blog, ObjectId> {
    Blog deleteBYID(ObjectId id);
    Blog findByID(ObjectId id);

}
