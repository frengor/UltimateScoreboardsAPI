//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public interface Line {

    String getLine(@Nullable Player player);

    Line clone();

}
