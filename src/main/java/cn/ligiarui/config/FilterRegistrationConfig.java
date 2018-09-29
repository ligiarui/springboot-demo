package cn.ligiarui.config;

import cn.ligiarui.filter.TokenFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 17:57
 **/
@Configuration
public class FilterRegistrationConfig {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean1(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
    	filterRegistrationBean.setFilter(new TokenFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);
        //order的数值越小 则优先级越高
        return filterRegistrationBean;
    }

}
