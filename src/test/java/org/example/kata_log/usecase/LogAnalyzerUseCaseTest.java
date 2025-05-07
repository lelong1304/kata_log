package org.example.kata_log.usecase;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LogAnalyzerUseCaseTest {
    private LogAnalyzerUseCase useCase;
    @Test
    void shouldReturnLogsByWarning() {
        String log = "2025-05-06T10:15:30 WARN High memory usage detected\n" +
                "2025-05-06T10:16:00 INFO User login successful\n" +
                "2025-05-06T10:16:05 ERROR Failed to connect to DB";

        var warns = useCase.getLogsByLevel(log, "WARN");

        assertThat(warns).hasSize(1);
    }
}
