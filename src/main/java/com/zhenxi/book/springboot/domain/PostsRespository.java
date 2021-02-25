package com.zhenxi.book.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRespository extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")//Spring Data JPA에서 제공하지 않는 메서드 쿼리작성
    List<Posts> findAllDesc();
}
