package com.github.simplemocks.async.api.entity;

import lombok.Builder;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * Async task dto
 *
 * @param uid         task unique identifier
 * @param type        task type
 * @param version     task version
 * @param retry       task retry count
 * @param createdAt   task creation date
 * @param lastRetryAt task last retry date
 * @param parameters  task parameters
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record AsyncTask(String uid,
                        String type,
                        String version,
                        int retry,
                        ZonedDateTime createdAt,
                        ZonedDateTime lastRetryAt,
                        Map<String, String> parameters) {

}
