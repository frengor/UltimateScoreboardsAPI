// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.events;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import lombok.Getter;
import org.bukkit.entity.Player;

/**
 * Called after {@link ScoreboardSwitchEvent} if the player is added to another scoreboard.<br>
 * Called after {@link ScoreboardDisposedEvent} if the removal was caused by the dispose of the scoreboard.
 * In this case the event's scoreboard is disposed.<br>
 * Called always before {@link ScoreboardShowEvent}.<br>
 * Player isn't in the scoreboard.
 */
public class ScoreboardHideEvent extends ScoreboardEvent {

    @Getter
    private final Player player;

    public ScoreboardHideEvent(Player player, Scoreboard scoreboard) {
        super(scoreboard);
        this.player = player;
    }
}
