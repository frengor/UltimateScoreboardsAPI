//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.lines;

import com.fren_gor.ultimateScoreboards.api.Line;

import java.util.List;

public interface SlidingLine extends Line {

    List<String> getLines();

    int getSteps();

    void setLine(String line);

    void setLine(String line, boolean skipBlanks);

    void setLine(String line, boolean skipBlanks, boolean reverse);

}
