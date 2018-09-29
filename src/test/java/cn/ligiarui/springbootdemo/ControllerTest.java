package cn.ligiarui.springbootdemo;

import cn.ligiarui.controller.SpringMvcDemo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 15:28
 **/
public class ControllerTest extends BaseApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new SpringMvcDemo()).build();
    }

    @Test
    public void findByUserNameController() throws Exception{
        System.out.println("我是测试");
        mvc.perform(MockMvcRequestBuilders.get("/userName").param("name","kebi"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("test3"));

    }
}
