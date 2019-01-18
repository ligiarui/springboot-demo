package cn.ligiarui.Annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author: lijiarui
 * @create: 2019-01-18 09:32
 **/
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {
}
