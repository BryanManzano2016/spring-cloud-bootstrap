package com.bmanzano.managerServices.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;

@FeignClient(value = "timestamp", url = "http://localhost:10020/")
public interface TimestampApi {
    @RequestMapping(method = RequestMethod.GET, value = "/timestamp/local")
    LocalDateTime getLocal();
}