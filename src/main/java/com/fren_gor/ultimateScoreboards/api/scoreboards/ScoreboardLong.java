//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.scoreboards;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;

public interface ScoreboardLong extends Scoreboard {

    boolean isEnsureUniqueness();

    long getTimeToNextUpdate();

}
