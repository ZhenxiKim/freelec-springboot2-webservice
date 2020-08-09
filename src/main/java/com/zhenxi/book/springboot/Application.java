package com.zhenxi.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication//스프링 부트의 자동 설정 스프링 빈 읽기와 생성 자동 설정
//여기부터 읽기때문에 최상단에 있어야함
//내장 was 실행
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);//프로젝트의 메인 클래
    }

    /*String start = "2020-10-31";
    String end = "2020-02-03";

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date start_time = null;
    Date end_time = null;


    {
        try {
            start_time = sdf.parse(start);
            end_time = sdf.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int compare = start_time.compareTo(end_time);

        if(compare > 0){

        }else if(compare < 0){

        }else{

        }
    }*/
}
