package cn.ligiarui.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-29 18:23
 **/
//@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进log");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
