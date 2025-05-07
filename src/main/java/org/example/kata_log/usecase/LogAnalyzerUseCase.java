package org.example.kata_log.usecase;

import java.util.List;

public interface LogAnalyzerUseCase {
    List<LogEntry> getLogsByLevel(String log, String level);
}
