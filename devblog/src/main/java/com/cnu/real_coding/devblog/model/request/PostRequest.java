package com.cnu.real_coding.devblog.model.request;


import com.cnu.real_coding.devblog.entity.Post;
import com.cnu.real_coding.devblog.model.type.Tag;
import jakarta.validation.Valid;
import lombok.Getter;

@Getter
public class PostRequest {
    @Valid
    private String title;
    private String contents;

    private Tag tag;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .contents(contents)
                .tag(tag)
                .build();
    }
}
