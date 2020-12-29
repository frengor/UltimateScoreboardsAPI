// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import org.jetbrains.annotations.Contract;

@FunctionalInterface
public interface ScoreboardCrafter<T> {

    @Contract(" -> new")
    T get();

}
