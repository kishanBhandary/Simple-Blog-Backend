package com.Simple.Blog.Backend.Simple.Blog.Backend.Model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "BlogDetails")
public class Blog {
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    @NonNull
    private String content;
    @NonNull
    private String author;
}
