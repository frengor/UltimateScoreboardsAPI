// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.events;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import lombok.Getter;
import org.bukkit.entity.Player;

/**
 * Called before {@link ScoreboardShowEvent} and {@link ScoreboardHideEvent} events.<br>
 * Player is present in both old and new scoreboards.
 */
public class ScoreboardSwitchEvent extends ScoreboardEvent {

    @Getter
    private final Scoreboard newScoreboard;
    @Getter
    private final Player player;

    public ScoreboardSwitchEvent(Player player, Scoreboard old, Scoreboard newScoreboard) {
        super(old);
        this.newScoreboard = newScoreboard;
        this.player = player;
    }

    public Scoreboard getOldScoreboard() {
        return getScoreboard();
    }

}
