//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.scoreboards;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import com.fren_gor.ultimateScoreboards.api.ScoreboardType;

public interface ScoreboardStatic extends Scoreboard {

    boolean isEnsureUniqueness();

    @Override
    default ScoreboardType getType() {
        return ScoreboardType.STATIC;
    }

}
