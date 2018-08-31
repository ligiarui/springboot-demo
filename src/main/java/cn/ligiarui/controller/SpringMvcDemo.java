package cn.ligiarui.controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringMvcDemo {

    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public String findByUserName() {
        System.out.println("开始...");
        return "test3";
    }
}
