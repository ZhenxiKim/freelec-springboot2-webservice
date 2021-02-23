package com.zhenxi.book.springboot.web.dto;

import com.zhenxi.book.springboot.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;
    private String author;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
    }


}
