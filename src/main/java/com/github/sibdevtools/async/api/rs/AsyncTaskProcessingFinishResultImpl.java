package com.github.sibdevtools.async.api.rs;

/**
 * @author sibmaks
 * @since 0.0.1
 */
class AsyncTaskProcessingFinishResultImpl implements AsyncTaskProcessingResult {
    @Override
    public boolean isFinished() {
        return true;
    }
}
