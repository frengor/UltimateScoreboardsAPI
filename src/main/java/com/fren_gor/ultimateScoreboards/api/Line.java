//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import com.fren_gor.ultimateScoreboards.api.lines.PlaceholderLine;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public interface Line {

    /**
     * Get the new line to be displayed on the scoreboard.
     *
     * @param player The player who is viewing the scoreboard. If more players are viewing the scoreboard,
     * then the first one is passed. null if there are no viewers.
     * @return The new line to be displayed on the scoreboard.
     */
    String getLine(@Nullable Player player);

    Line clone();

    /**
     * Returns whether placeholders should be applied before getting the new line.
     * Placeholders pre-processing works like this:
     * <ul>
     *     <li>{@link Line#requirePlaceholdersPreProcessing()} is called by outer {@link PlaceholderLine}</li>
     *     <li>{@link Line#getRawLine()} is called by outer {@link PlaceholderLine}</li>
     *     <li>{@link Line#setProcessedLine(String)} is called by outer {@link PlaceholderLine} passing the processed line</li>
     *     <li>{@link Line#getLine(Player)} is called getting the new line</li>
     * </ul>
     *
     * @return true is placeholders pre-processing is required, false otherwise.
     */
    default boolean requirePlaceholdersPreProcessing() {
        return false;
    }

    /**
     * Returns the raw line. Used in placeholder pre-processing.
     *
     * @return The raw line.
     * @throws UnsupportedOperationException If placeholders pre processing is disabled.
     */
    default String getRawLine() {
        throw new UnsupportedOperationException("Placeholders pre processing is disabled.");
    }

    /**
     * Saves the processed line. Used in placeholder pre-processing.
     *
     * @param line The processed line.
     * @throws UnsupportedOperationException If placeholders pre processing is disabled.
     */
    default void setProcessedLine(String line) {
        throw new UnsupportedOperationException("Placeholders pre processing is disabled.");
    }

}
