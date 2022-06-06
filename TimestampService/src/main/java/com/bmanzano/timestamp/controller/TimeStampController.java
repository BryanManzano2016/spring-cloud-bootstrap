package com.bmanzano.timestamp.controller;

import com.bmanzano.timestamp.service.TimeStampService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/timestamp")
public class TimeStampController {

    final TimeStampService timeStampService;

    public TimeStampController(TimeStampService timeStampService) {
        this.timeStampService = timeStampService;
    }

    @GetMapping("/local")
    public LocalDateTime getLocal() {
        LocalDateTime now = timeStampService.getNow();
        log.info("now {}", now);
        return now;
    }
}
