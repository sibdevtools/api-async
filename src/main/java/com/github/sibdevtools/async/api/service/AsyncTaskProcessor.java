package com.github.sibdevtools.async.api.service;

import com.github.sibdevtools.async.api.entity.AsyncTask;
import com.github.sibdevtools.async.api.rs.AsyncTaskProcessingResult;
import jakarta.annotation.Nonnull;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface AsyncTaskProcessor {

    /**
     * Process an async task.
     * <p>
     * In case of exception retry used {@link #getDefaultRetryStep()}.
     * </p>
     *
     * @param task async task description
     * @return result of task processing
     */
    @Nonnull
    AsyncTaskProcessingResult process(@Nonnull AsyncTask task);

    /**
     * Default retry step interval.
     * <p>
     * In case of exception used 30 seconds.
     * </p>
     *
     * @return retry step interval.
     */
    default TemporalAmount getDefaultRetryStep() {
        return Duration.ofSeconds(30);
    }
}
