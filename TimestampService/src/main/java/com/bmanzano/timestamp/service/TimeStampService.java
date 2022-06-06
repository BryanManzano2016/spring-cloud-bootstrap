package com.bmanzano.timestamp.service;

import brave.Tracer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class TimeStampService {

    private final Tracer tracer;

    public TimeStampService(Tracer tracer) {
        this.tracer = tracer;
    }

    public LocalDateTime getNow() {
        LocalDateTime now = LocalDateTime.now();
        log.info("Span ID {} - now={}", tracer.currentSpan().context().spanIdString(), now);
        return now;
    }
}
