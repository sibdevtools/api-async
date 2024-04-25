package com.github.simple_mocks.async.api.rs;

import java.time.ZonedDateTime;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface AsyncTaskProcessingRetryResult extends AsyncTaskProcessingResult {

    /**
     * Get next attempt time
     *
     * @return next attempt time
     */
    ZonedDateTime nextAttemptAt();

}
