package com.zhenxi.book.springboot.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor//final로 선언되지 않은 필드는 생성자에 포함되지 않음


public class HelloResponseDto {
    private final String name;
    private final int amount;
}



