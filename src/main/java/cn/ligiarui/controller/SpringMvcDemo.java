package cn.ligiarui.controller;


import cn.ligiarui.Annotation.Auth;
import cn.ligiarui.param.ValidatorDemo;
import cn.ligiarui.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@SpringBootApplication

@RestController
@Api(tags="测试API")
public class SpringMvcDemo {


    @Autowired
    private DemoService demoService;

    @Auth
    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    @ApiOperation(value="用户查找")
    public String findByUserName(@Valid ValidatorDemo param) {
        System.out.println("controller开始...param:" +param.getName());
        demoService.demoMethod();
        return "test3";
    }
}
