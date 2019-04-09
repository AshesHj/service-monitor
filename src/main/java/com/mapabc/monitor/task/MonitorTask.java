package com.mapabc.monitor.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description: [定时任务监控]
 * @author yinguijin
 * @version 1.0
 * Created on 2019/4/9 14:53
 */
@Component
public class MonitorTask {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0/10 * * * * *")
    public void scheduled(){
        LOGGER.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
    }
}
