package com.yx.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*定时任务,记得在启动类加上@EnableScheduling*/
@Component
@Slf4j
public class ScalTask {

    /*每隔3s执行ScalTask方法*/
 //@Scheduled(fixedRate = 3000)
    @Scheduled(cron = "1/2 * * * * ?")
public void ScalTask(){

     /*System.out.println("当前时间是："+System.currentTimeMillis());*/
     log.info("定时时间是："+System.currentTimeMillis());
}


}
