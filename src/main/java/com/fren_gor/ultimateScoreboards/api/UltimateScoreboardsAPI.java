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
import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

/**
 * API main class.
 *
 * @author fren_gor
 */
public final class UltimateScoreboardsAPI {

    /**
     * Creates a new instance of the API.
     *
     * @param plugin The plugin requesting the API.
     */
    public UltimateScoreboardsAPI(@NotNull Plugin plugin) {
        throw new NotImplementedException();
    }

    // =============== Long Scoreboard ===================

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _, _ -> new", pure = true)
    public ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _ -> new")
    public <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _, _ -> new")
    public <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, long updateFrequency) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _, _ -> new")
    public <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _, _, _ -> new")
    public <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, long updateFrequency, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    // =============== Lite Scoreboard ===================

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _ -> new")
    public <P extends Player> ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers) {
        throw new NotImplementedException();
    }

    @NotNull
    public <P extends Player> ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, long updateFrequency) {
        throw new NotImplementedException();
    }

    // =============== Static Scoreboard ===================

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _ -> new")
    public <P extends Player> ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _, _ -> new")
    public <P extends Player> ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, boolean ensureUniqueness) {
        throw new NotImplementedException();
    }

    // =============== v1_13 Scoreboard ===================

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _ -> new")
    public <P extends Player> Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract("_, _, _, _ -> new")
    public <P extends Player> Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers, long updateFrequency) {
        throw new NotImplementedException();
    }

    // =============== Lines ===================

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public TextLine craftTextLine(@NotNull String line) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public SlidingLine craftSlidingLine(@NotNull String line) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public SlidingLine craftSlidingLine(@NotNull String line, boolean skipBlanks) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _, _ -> new", pure = true)
    public SlidingLine craftSlidingLine(@NotNull String line, boolean skipBlanks, boolean reverse) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public StepLine craftStepLine(@NotNull Collection<String> steps) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public UpdateFrequencyLine addUpdateFrequency(@NotNull Line base, long updateFrequency) {
        throw new NotImplementedException();
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public PlaceholderLine addPlaceholdersReplacing(@NotNull Line base) {
        throw new NotImplementedException();
    }

    // =========================================

    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public ScoreboardGroup craftScoreboardGroup(boolean perPlayerScoreboard, @NotNull ScoreboardCrafter<Scoreboard> scoreboardCrafter) {
        throw new NotImplementedException();
    }

    public void hide(@NotNull Player player) {
        throw new NotImplementedException();
    }

    @Contract(pure = true)
    public boolean isViewing(@NotNull Player player) {
        throw new NotImplementedException();
    }

    @Nullable
    @Contract(pure = true)
    public Scoreboard getCurrentScoreboard(@NotNull Player player) {
        throw new NotImplementedException();
    }

    public void show(@NotNull Player player, @NotNull Scoreboard scoreboard) {
        throw new NotImplementedException();
    }

    public void showDefaultScoreboard(@NotNull Player player) {
        throw new NotImplementedException();
    }

}
