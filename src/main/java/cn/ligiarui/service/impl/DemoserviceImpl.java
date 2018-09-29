package cn.ligiarui.service.impl;

import cn.ligiarui.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 15:46
 **/
@Service
public class DemoserviceImpl implements DemoService {

    @Value("${server.port}")
    private String port;

    @Override
    public void demoMethod() {
        System.out.println("我是service测试方法,port:" + port);
    }
}
