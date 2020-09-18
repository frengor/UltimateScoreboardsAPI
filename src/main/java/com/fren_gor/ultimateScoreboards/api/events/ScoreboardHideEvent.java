// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.events;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import lombok.Getter;
import org.bukkit.entity.Player;

public class ScoreboardHideEvent extends ScoreboardEvent {

    @Getter
    private final Player player;

    public ScoreboardHideEvent(Player player, Scoreboard scoreboard) {
        super(scoreboard);
        this.player = player;
    }
}
