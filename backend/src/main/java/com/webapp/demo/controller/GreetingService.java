package com.webapp.demo.controller;

import com.newrelic.api.agent.Trace;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    @Trace
    public String getGreeting() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Greetings from Spring Boot!";
    }

    @Trace(metricName = "MetricOne", dispatcher = true, async = true)
    public String asyncGreeting() {
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Async greetings from Spring Boot!";
    }

    @Trace(metricName = "FailDivisionByZero")
    public String zeroGreeting() {
        int c = 100 / 0;
        return "Division By Zero!";
    }
}