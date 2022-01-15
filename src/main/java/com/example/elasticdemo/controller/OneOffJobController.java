package com.example.elasticdemo.controller;

import org.apache.shardingsphere.elasticjob.lite.api.bootstrap.impl.OneOffJobBootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneOffJobController {
    
    private static final String RES_TEXT = "{\"msg\":\"OK\"}";
    @Autowired
    @Qualifier(value = "occurErrorNoticeEmailBean")
    private OneOffJobBootstrap occurErrorNoticeEmailJob;

    public OneOffJobController(OneOffJobBootstrap occurErrorNoticeEmailJob) {
        this.occurErrorNoticeEmailJob = occurErrorNoticeEmailJob;
    }

    @GetMapping("/execute/occurErrorNoticeEmailJob")
    public String executeOccurErrorNoticeEmailJob() {
        occurErrorNoticeEmailJob.execute();
        return RES_TEXT;
    }
}
