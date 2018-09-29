package cn.ligiarui.springbootdemo;

import cn.ligiarui.service.DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 15:48
 **/
public class ServiceTest extends BaseApplicationTests{

    @Autowired
    private DemoService demoService;

    @Test
    public void serviceTest(){
        demoService.demoMethod();
    }
}
