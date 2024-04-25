package com.github.simple_mocks.async.api.rq;

import lombok.Builder;

import java.time.ZonedDateTime;
import java.util.Map;

/**
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
