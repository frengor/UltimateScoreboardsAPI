//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.exceptions;

/**
 * Thrown when a scoreboard-related {@link Exception} is thrown.
 */
public class ScoreboardException extends RuntimeException {

    private static final long serialVersionUID = 2101307492949933727L;

    public ScoreboardException() {
    }

    public ScoreboardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ScoreboardException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreboardException(String message) {
        super(message);
    }

    public ScoreboardException(Throwable cause) {
        super(cause);
    }

}
