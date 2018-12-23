package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {
    @RequestMapping("/hello")
    String home() {
        return "<br><hr/>Hello World!<hr/><hr/>啊哈哈，这就是一个spring-boot项目啊";
    }
    @RequestMapping("/hello1")
    public ModelAndView index(HttpServletRequest request){
        ModelAndView mav = new ModelAndView("/index");
        String ctx = request.getContextPath();
        System.out.println(ctx);
        mav.addObject("ctx", ctx);
        return mav;
    }
}
