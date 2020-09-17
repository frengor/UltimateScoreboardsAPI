// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.events;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class ScoreboardSwitchEvent extends ScoreboardEvent implements Cancellable {

    @Getter
    @Setter
    private boolean cancelled;

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
