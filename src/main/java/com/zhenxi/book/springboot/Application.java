package com.zhenxi.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
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
