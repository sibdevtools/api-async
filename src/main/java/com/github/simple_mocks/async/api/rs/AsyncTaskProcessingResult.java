package com.github.simple_mocks.async.api.rs;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface AsyncTaskProcessingResult {

    /**
     * If this attempt was the last one or retry required.
     *
     * @return true - retry required, false - otherwise
     */
    boolean isFinished();

}
