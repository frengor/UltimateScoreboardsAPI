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
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
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

    private static UltimateScoreboardsAPI api;

    /**
     * Get an instance of {@link UltimateScoreboardsAPI}.
     *
     * @return An instance of {@link UltimateScoreboardsAPI}. {@code null} if UltimateScoreboard plugin is not enabled.
     */
    @Nullable
    public static UltimateScoreboardsAPI getAPI() {
        return api;
    }

    /**
     * Set an instance of {@link UltimateScoreboardsAPI} to be retrieved with {@link UltimateScoreboardsAPI#getAPI()}.
     *
     * @param api An instance of {@link UltimateScoreboardsAPI}. {@code null} if UltimateScoreboards plugin id disabling.
     */
    public static void setAPI(@Nullable UltimateScoreboardsAPI api) {
        UltimateScoreboardsAPI.api = api;
    }

    // =============== Long Scoreboard ===================

    @NotNull
    public abstract ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines);

    @NotNull
    public abstract ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency);

    @NotNull
    public abstract ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, boolean ensureUniqueness);

    @NotNull
    public abstract ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency, boolean ensureUniqueness);

    @NotNull
    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers);

    @NotNull
    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    @NotNull
    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                          boolean ensureUniqueness);

    @NotNull
    public abstract <P extends Player> ScoreboardLong craftLongScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency, boolean ensureUniqueness);

    // =============== Lite Scoreboard ===================

    @NotNull
    public abstract ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines);

    @NotNull
    public abstract ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency);

    @NotNull
    public abstract <P extends Player> ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers);

    @NotNull
    public abstract <P extends Player> ScoreboardLite craftLiteScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    // =============== Static Scoreboard ===================

    @NotNull
    public abstract ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines);

    @NotNull
    public abstract ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, boolean ensureUniqueness);

    @NotNull
    public abstract <P extends Player> ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers);

    @NotNull
    public abstract <P extends Player> ScoreboardStatic craftStaticScoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                              boolean ensureUniqueness);

    // =============== v1_13 Scoreboard ===================

    @NotNull
    public abstract Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines);

    @NotNull
    public abstract Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, long updateFrequency);

    @NotNull
    public abstract <P extends Player> Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers);

    @NotNull
    public abstract <P extends Player> Scoreboard1_13 craft1_13Scoreboard(@NotNull Line title, @NotNull List<Line> lines, @Nullable Collection<P> viewers,
                                                                          long updateFrequency);

    // =============== Lines ===================

    @NotNull
    public abstract TextLine craftTextLine(@NotNull String line);

    @NotNull
    public abstract SlidingLine craftSlidingLine(@NotNull String line);

    @NotNull
    public abstract SlidingLine craftSlidingLine(@NotNull String line, boolean skipBlanks);

    @NotNull
    public abstract SlidingLine craftSlidingLine(@NotNull String line, boolean skipBlanks, boolean reverse);

    @NotNull
    public abstract StepLine craftStepLine(@NotNull Collection<String> steps);

    @NotNull
    public abstract UpdateFrequencyLine addUpdateFrequency(@NotNull Line base, long updateFrequency);

    @NotNull
    public abstract PlaceholderLine addPlaceholdersReplacing(@NotNull Line base);

    // =========================================

    @NotNull
    public abstract ScoreboardGroup craftScoreboardGroup(boolean perPlayerScoreboard, @NotNull Supplier<Scoreboard> scoreboardCrafter);

    public abstract void hide(@NotNull Player player);

    public abstract boolean isViewing(@NotNull Player player);

    @Nullable
    public abstract Scoreboard getCurrentScoreboard(@NotNull Player player);

    public abstract void show(@NotNull Player player, @NotNull Scoreboard scoreboard);

    public abstract void showDefaultScoreboard(@NotNull Player player);

}
