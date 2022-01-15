package com.example.elasticdemo.job;

import lombok.SneakyThrows;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MyJob1 implements SimpleJob {
    private static final SimpleDateFormat formatter =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @SneakyThrows
    @Override
    public void execute(ShardingContext context) {
        System.out.println(formatter.format(new Date()) + " : " + context.getShardingParameter() + "进行数据备份...");
        Thread.sleep(2000);
        System.out.println(formatter.format(new Date()) + " : " + context.getShardingParameter() + "完成数据备份。");

    }
}
