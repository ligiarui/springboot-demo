package cn.ligiarui.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-12-21 15:24
 **/
@Data
public class User implements Serializable {

    private Integer id;

    private String name;
}
