package com.example.operationsoftwo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class OperationsoftwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OperationsoftwoApplication.class, args);
        log.info("server started");
    }

}
