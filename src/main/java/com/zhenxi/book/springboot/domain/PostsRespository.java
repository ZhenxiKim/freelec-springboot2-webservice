package com.zhenxi.book.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRespository extends JpaRepository<Posts,Long> {
}
