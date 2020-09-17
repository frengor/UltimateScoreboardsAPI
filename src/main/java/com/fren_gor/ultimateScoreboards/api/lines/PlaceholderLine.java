// Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.lines;

import com.fren_gor.ultimateScoreboards.api.Line;

public interface PlaceholderLine extends Line {

    Line getInternalLine();

    void setInternalLine(Line internalLine);

}
