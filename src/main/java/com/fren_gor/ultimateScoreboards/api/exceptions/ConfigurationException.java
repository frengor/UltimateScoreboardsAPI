//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.exceptions;

/**
 * Thrown when a configuration-related {@link Exception} is thrown.
 */
public class ConfigurationException extends RuntimeException {

    private static final long serialVersionUID = 5208190250804744307L;

    public ConfigurationException() {
    }

    public ConfigurationException(String message, Throwable cause, boolean enableSuppression,
                                  boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(Throwable cause) {
        super(cause);
    }

}
