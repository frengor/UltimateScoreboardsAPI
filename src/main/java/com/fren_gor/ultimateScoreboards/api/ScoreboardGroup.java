//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import org.bukkit.plugin.Plugin;

public interface ScoreboardGroup {

    boolean isPerPlayerScoreboard();

    Scoreboard craftScoreboard();

    Plugin getOwningPlugin();

}
