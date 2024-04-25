package com.github.simple_mocks.async.api.rs;

import lombok.Getter;

import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
record AsyncTaskProcessingRetryResultImpl(
        ZonedDateTime nextAttemptAt) implements AsyncTaskProcessingRetryResult {

    @Override
    public boolean isFinished() {
        return false;
    }

}
