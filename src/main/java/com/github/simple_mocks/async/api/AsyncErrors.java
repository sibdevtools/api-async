package com.github.simple_mocks.async.api;

import com.github.simple_mocks.error_service.exception.ServiceError;
import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@AllArgsConstructor
public enum AsyncErrors implements ServiceError {
    /**
     * Unexpected error happened
     */
    UNEXPECTED_ERROR;

    @Nonnull
    @Override
    public String getErrorCode() {
        return name();
    }

    @Nonnull
    @Override
    public String getSystemCode() {
        return "ASYNC";
    }
}
