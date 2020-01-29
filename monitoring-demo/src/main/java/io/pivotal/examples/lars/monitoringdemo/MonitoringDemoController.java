package io.pivotal.examples.lars.monitoringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MonitoringDemoController
 */
@RestController
public class MonitoringDemoController {

    @GetMapping
    public String message() {
        return "Hello Monitoring Demo";
    }
    
}