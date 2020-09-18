// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.events;

import com.fren_gor.ultimateScoreboards.api.Scoreboard;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;

public class ScoreboardDisposedEvent extends ScoreboardEvent implements Cancellable {

    @Getter
    @Setter
    private boolean cancelled;

    public ScoreboardDisposedEvent(Scoreboard scoreboard) {
        super(scoreboard);
    }
}
