//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Scoreboard {

    void setUpdateFrequency(long updateFrequency);

    long getUpdateFrequency();

    boolean isDisposed();

    void dispose();

    Line getTitle();

    void setTitle(Line title);

    void addLines(Line... lines);

    void removeLines(Line... lines);

    List<Line> getLines();

    void setLines(List<Line> lines);

    Set<Player> getViewers();

    boolean isViewing(Player player);

    void addViewer(Player player);

    void addViewers(Player... players);

    <P extends Player> void addViewers(Collection<P> players);

    void removeViewer(Player player);

    void removeViewers(Player... players);

    <P extends Player> void removeViewers(Collection<P> players);

}
