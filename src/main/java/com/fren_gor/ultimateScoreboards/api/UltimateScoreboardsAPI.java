//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import com.fren_gor.ultimateScoreboards.api.lines.PlaceholderLine;
import com.fren_gor.ultimateScoreboards.api.lines.SlidingLine;
import com.fren_gor.ultimateScoreboards.api.lines.StepLine;
import com.fren_gor.ultimateScoreboards.api.lines.TextLine;
import com.fren_gor.ultimateScoreboards.api.lines.UpdateFrequencyLine;
import com.fren_gor.ultimateScoreboards.api.scoreboards.Scoreboard1_13;
import com.fren_gor.ultimateScoreboards.api.scoreboards.ScoreboardLite;
import com.fren_gor.ultimateScoreboards.api.scoreboards.ScoreboardLong;
import com.fren_gor.ultimateScoreboards.api.scoreboards.ScoreboardStatic;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

/**
 * API main class.
 *
 * @author fren_gor
 */
public abstract class UltimateScoreboardsAPI {

    @Getter
    @Setter
    @Nullable
    public static UltimateScoreboardsAPI API;

    // =============== Long Scoreboard ===================

    public abstract ScoreboardLong craftLongScoreboard(Line title, List<Line> lines);

    public abstract ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, long updateFrequency);

    public abstract ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, boolean ensureUniqueness);

    public abstract ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, long updateFrequency, boolean ensureUniqueness);

    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers);

    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                          boolean ensureUniqueness);

    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency, boolean ensureUniqueness);

    // =============== Lite Scoreboard ===================

    public abstract ScoreboardLite craftLiteScoreboard(Line title, List<Line> lines);

    public abstract ScoreboardLite craftLiteScoreboard(Line title, List<Line> lines, long updateFrequency);

    public abstract <P extends Player> ScoreboardLite craftLiteScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers);

    public abstract <P extends Player> ScoreboardLite craftLiteScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    // =============== Static Scoreboard ===================

    public abstract ScoreboardStatic craftStaticScoreboard(Line title, List<Line> lines);

    public abstract ScoreboardStatic craftStaticScoreboard(Line title, List<Line> lines, boolean ensureUniqueness);

    public abstract <P extends Player> ScoreboardStatic craftStaticScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers);

    public abstract <P extends Player> ScoreboardStatic craftStaticScoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                              boolean ensureUniqueness);

    // =============== v1_13 Scoreboard ===================

    public abstract Scoreboard1_13 craft1_13Scoreboard(Line title, List<Line> lines);

    public abstract Scoreboard1_13 craft1_13Scoreboard(Line title, List<Line> lines, long updateFrequency);

    public abstract <P extends Player> Scoreboard1_13 craft1_13Scoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers);

    public abstract <P extends Player> Scoreboard1_13 craft1_13Scoreboard(Line title, List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    // =============== Lines ===================

    public abstract TextLine craftTextLine(String line);

    public abstract SlidingLine craftSlidingLine(String line);

    public abstract SlidingLine craftSlidingLine(String line, boolean skipBlanks);

    public abstract SlidingLine craftSlidingLine(String line, boolean skipBlanks, boolean reverse);

    public abstract StepLine craftStepLine(Collection<String> steps);

    public abstract UpdateFrequencyLine addUpdateFrequency(Line base, long updateFrequency);

    public abstract PlaceholderLine addPlaceholdersReplacing(Line base);

    // =========================================

    public abstract ScoreboardGroup craftScoreboardGroup(boolean perPlayerScoreboard, Supplier<Scoreboard> scoreboardCrafter);

    public abstract void hide(Player player);

    public abstract boolean isViewing(Player player);

    @Nullable
    public abstract Scoreboard getCurrentScoreboard(Player player);

    public abstract void show(Player player, Scoreboard scoreboard);

    public abstract void showDefaultScoreboard(Player player);

}
