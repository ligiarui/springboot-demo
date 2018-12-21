package cn.ligiarui.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lijiarui
 * @create: 2018-10-11 23:43
 **/
@RestController
@RequestMapping("/redis")
@Api(tags = "redis 测试API")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("set/{key}/{value}")
    @ApiOperation(value="设置缓存")
    public String set(@PathVariable("key")String key, @PathVariable("value") String value) {
        //注意这里的 key不能为null spring 内部有检验
        stringRedisTemplate.opsForValue().set(key, value);
        return key + "," + value;
    }

    @GetMapping("get/{key}")
    @ApiOperation(value="根据key获取缓存")
    public String get(@PathVariable("key") String key) {
        return "key=" + key + ",value=" + stringRedisTemplate.opsForValue().get(key);
    }

}
