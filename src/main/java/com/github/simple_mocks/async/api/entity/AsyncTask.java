package com.github.simple_mocks.async.api.entity;

import lombok.Builder;

import java.time.ZonedDateTime;
import java.util.Map;

/**
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
