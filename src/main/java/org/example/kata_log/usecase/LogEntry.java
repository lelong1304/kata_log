package org.example.kata_log.usecase;

import java.time.LocalDateTime;

public record LogEntry(
        LocalDateTime date,
        String level,
        String message
) {
}

