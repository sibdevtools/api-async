package com.github.simplemocks.async.api.service;

import com.github.simplemocks.async.api.rq.CreateAsyncTaskRq;
import com.github.simplemocks.async.api.rs.CreateAsyncTaskRs;
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
     * @return create async task response
     */
    @Nonnull
    CreateAsyncTaskRs registerTask(@Nonnull CreateAsyncTaskRq rq);

}
