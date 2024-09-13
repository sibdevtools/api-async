package com.github.simplemocks.async.api.service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AsyncTaskProcessorMeta {
    /**
     * Processing a task type.
     *
     * @return processing a task type
     */
    String taskType();

    /**
     * Processing task version.
     * <p>
     * Empty means processor can process any version.
     * </p>
     *
     * @return processing task versions
     */
    String[] taskVersions() default {};
}
