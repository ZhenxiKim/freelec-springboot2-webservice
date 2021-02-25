package com.zhenxi.book.springboot.service;

import com.zhenxi.book.springboot.domain.Posts;
import com.zhenxi.book.springboot.domain.PostsRespository;
import com.zhenxi.book.springboot.web.dto.PostSaveRequestDto;
import com.zhenxi.book.springboot.web.dto.PostsListResponseDto;
import com.zhenxi.book.springboot.web.dto.PostsUpdateRequestDto;
import com.zhenxi.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRespository postsRespository;

    @Transactional
    public Long save(PostSaveRequestDto requestDto){
        return postsRespository.save(requestDto.toEntity()).getId();
    }


    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRespository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }


    public PostsResponseDto findById(Long id){
        Posts entity = postsRespository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시글 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc(){
        return postsRespository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
