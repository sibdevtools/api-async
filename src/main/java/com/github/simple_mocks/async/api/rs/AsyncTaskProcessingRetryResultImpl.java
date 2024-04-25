package com.github.simple_mocks.async.api.rs;

import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
record AsyncTaskProcessingRetryResultImpl(
        ZonedDateTime nextAttemptAt) implements AsyncTaskProcessingRetryResult {

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public ZonedDateTime getNextAttemptAt() {
        return nextAttemptAt;
    }
}
