package cn.ligiarui.filter;

import com.alibaba.fastjson.JSON;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 16:43
 **/
//@WebFilter(urlPatterns = "/*")
//@Order(1)
public class TokenFilter implements Filter {

    public static int count = 0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //System.out.println(JSON.toJSONString(servletRequest.getParameterMap()));
        count++;
        System.out.println("count=" + count);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
