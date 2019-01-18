package cn.ligiarui.Interceptor;

import cn.ligiarui.Annotation.Auth;
import com.alibaba.fastjson.JSON;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-30 09:31
 **/
public class UrlInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(JSON.toJSONString(request.getParameterMap()));
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Auth auth = method.getAnnotation(Auth.class);
        if(auth == null){
            return true;
        } else {
            System.out.println("待权限验证");
        }
        return true;
    }
}
