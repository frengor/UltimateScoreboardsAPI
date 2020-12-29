//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.exceptions;

/**
 * Thrown when a disposed scoreboard method is call.
 */
public class DisposedException extends ScoreboardException {

    public DisposedException() {
    }

    public DisposedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DisposedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DisposedException(String message) {
        super(message);
    }

    public DisposedException(Throwable cause) {
        super(cause);
    }

}
