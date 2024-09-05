package com.github.simple_mocks.async.api.service;

import com.github.simple_mocks.async.api.rq.CreateAsyncTaskRq;
import jakarta.annotation.Nonnull;

/**
 * Async task service interface.
 *
 * @author sibmaks
 * @since 0.0.1
 */
public interface AsyncTaskService {

    /**
     * Register an async task.
     *
     * @param rq request for async task registration
     * @return true if task was registered, false otherwise
     */
    boolean registerTask(@Nonnull CreateAsyncTaskRq rq);

}
