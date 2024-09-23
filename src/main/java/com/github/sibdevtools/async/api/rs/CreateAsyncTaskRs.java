package com.github.sibdevtools.async.api.rs;

import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import jakarta.annotation.Nonnull;

/**
 * Create async task response
 *
 * @author sibmaks
 * @since 0.0.3
 */
public class CreateAsyncTaskRs extends StandardBodyRs<Boolean> {

    /**
     * Construct async task creation response
     *
     * @param status create async task status
     */
    public CreateAsyncTaskRs(boolean status) {
        super(status);
    }

    /**
     * Construct async task creation response with error
     *
     * @param error happened error
     */
    public CreateAsyncTaskRs(@Nonnull ErrorRsDto error) {
        super(error);
    }
}
