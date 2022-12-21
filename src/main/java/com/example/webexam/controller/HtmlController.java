package com.example.webexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // html 을 응답
public class HtmlController {
    @GetMapping("/hello")
//    @ResponseBody // 잘 사용하지 않는다.
    public String hello() {
        return "list"; // 뷰이름. 사용자가 요청을 보낼때 json을 달라, html을 달라. header정보.
    }

}
