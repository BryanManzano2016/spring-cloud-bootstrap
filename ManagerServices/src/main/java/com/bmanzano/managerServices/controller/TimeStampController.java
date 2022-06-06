package com.bmanzano.managerServices.controller;

import com.bmanzano.managerServices.apis.TimestampApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/timestamp")
public class TimeStampController {

    TimestampApi timestampApi;

    public TimeStampController(TimestampApi timestampApi) {
        this.timestampApi = timestampApi;
    }

    @GetMapping("/now")
    public LocalDateTime getLocal() {
        LocalDateTime time = timestampApi.getLocal();
        log.info("time request: {}", time);
        return time;
    }
}
