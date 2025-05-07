package org.example.kata_log.usecase;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LogAnalyzerUseCaseTest {
    private LogAnalyzerUseCase useCase;
    @Test
    void shouldReturnLogsByWarning() {
        String log = "2025-05-06T10:15:30 WARN High memory usage detected\n" +
                "2025-05-06T10:16:00 INFO User login successful\n" +
                "2025-05-06T10:16:05 ERROR Failed to connect to DB";

        useCase = new LogAnalyzer(log);
        List<LogEntry> warn = useCase.getLogsByLevel(log, "WARN");

        assertThat(warn).hasSize(1);
    }
}
