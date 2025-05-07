package org.example.kata_log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

You're given a list of log entries, each in the format:

2025-05-06T10:15:30 ERROR Failed to connect to DB
2025-05-06T10:16:00 INFO User login successful
2025-05-06T10:16:05 WARN High memory usage detected

Your task is to build the core logic that filters log entries by level (ERROR, INFO, WARN) and date range (start date and end date).

Methode signature: getLogsByLevel(String level)
 */

@SpringBootApplication
public class KataLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataLogApplication.class, args);
    }

}
