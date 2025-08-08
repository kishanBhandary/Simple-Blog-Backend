package com.Simple.Blog.Backend.Simple.Blog.Backend.Model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Blog {
    @NonNull
    private String title;
    @NonNull
    private String content;
    @NonNull
    private String author;
}
