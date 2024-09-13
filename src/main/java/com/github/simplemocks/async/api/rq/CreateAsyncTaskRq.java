package com.github.simplemocks.async.api.rq;

import lombok.Builder;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * Create async task request
 *
 * @param uid                task unique identifier
 * @param type               task type
 * @param version            task version
 * @param scheduledStartTime task scheduled start date
 * @param parameters         task parameters
 * @author sibmaks
 * @since 0.0.1
 */
@Builder
public record CreateAsyncTaskRq(String uid,
                                String type,
                                String version,
                                ZonedDateTime scheduledStartTime,
                                Map<String, String> parameters) {

}
