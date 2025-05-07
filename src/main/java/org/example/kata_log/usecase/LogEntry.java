package org.example.kata_log.usecase;

import java.time.LocalDateTime;

public record LogEntry(
        LocalDateTime date,
        Level level,
        String message
) {
}
