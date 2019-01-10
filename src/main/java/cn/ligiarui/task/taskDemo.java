package cn.ligiarui.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lijiarui
 * @create: 2019-01-10 16:53
 **/
@Component
@Slf4j
public class taskDemo {

    @Scheduled(cron = "0/10 * * * * ?")
    public void fixedRateJob(){
        System.out.println("哈哈");
        //log.info(" {}","aaa");
    }

}
