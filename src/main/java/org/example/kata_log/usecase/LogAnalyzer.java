package org.example.kata_log.usecase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogAnalyzer implements LogAnalyzerUseCase{
    private final List<LogEntry> logs;

    public LogAnalyzer(List<LogEntry> logs) {
        this.logs = logs;
    }

    public LogAnalyzer(String log) {
        this.logs = parseLogs(log);
    }

    private List<LogEntry> parseLogs(String log) {
        List<LogEntry> logEntries = new ArrayList<>();
        String[] lines = log.split("\n");
        for (String line : lines) {
            String[] parts = line.split(" ", 3);
            if (parts.length == 3) {
                LocalDateTime date = LocalDateTime.parse(parts[0]);
                String level = parts[1];
                String message = parts[2];
                logEntries.add(new LogEntry(date, Level.valueOf(level), message));
            }
        }
        return logEntries;
    }
    @Override
    public List<LogEntry> getLogsByLevel(String log, Level level) {
        return logs.stream()
                .filter(l -> l.level().equals(level))
                .collect(Collectors.toList());
    }
}
