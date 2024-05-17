package me.dio.santandersdw24.domain.exception;

public class championNotFoundException extends RuntimeException {
    public championNotFoundException(Long championId) {

        super("Champion %d not found".formatted(championId));

    }
}
