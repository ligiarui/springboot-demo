package cn.ligiarui.controller;


import cn.ligiarui.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication

@RestController
public class SpringMvcDemo {


    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public String findByUserName(HttpServletRequest request) {
        System.out.println("controller findByUserName开始...");
        demoService.demoMethod();
        return "test3";
    }
}
