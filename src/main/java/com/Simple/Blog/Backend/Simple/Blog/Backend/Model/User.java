package com.Simple.Blog.Backend.Simple.Blog.Backend.Model;
import org.bson.types.ObjectId;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Users")
public class User {
    @Id
    private ObjectId id;
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @DBRef
    private List<Blog> blogList=new ArrayList<>();

}
