package org.example.kata_log.usecase;

import java.util.List;

public interface LogAnalyzerUseCase {
    List<String> getLogsByLevel(String log, String level);
}
