package com.github.simplemocks.async.api.rs;

import jakarta.annotation.Nonnull;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AsyncTaskProcessingResultBuilder {

    /**
     * Create a finish result for async task processing.
     *
     * @return instance of {@link AsyncTaskProcessingResult}
     */
    @Nonnull
    public static AsyncTaskProcessingResult createFinishResult() {
        return new AsyncTaskProcessingFinishResultImpl();
    }

    /**
     * Create a retry result for async task processing.
     *
     * @param nextAttemptAt next attempt date time
     * @return instance of {@link AsyncTaskProcessingRetryResult}
     */
    @Nonnull
    public static AsyncTaskProcessingRetryResult createRetryResult(@Nonnull ZonedDateTime nextAttemptAt) {
        Objects.requireNonNull(nextAttemptAt, "nextAttemptAt cannot be null");
        return new AsyncTaskProcessingRetryResultImpl(nextAttemptAt);
    }

}
