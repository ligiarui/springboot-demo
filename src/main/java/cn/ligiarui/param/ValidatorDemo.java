package cn.ligiarui.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-09-30 10:58
 **/
@Data
@ApiModel
public class ValidatorDemo {

    @NotNull(message="id不为空")
    private Integer id;

    private String email;

    @Length(max=10,message="name长度不能超过10")
    private String name;
}
