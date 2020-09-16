//  Copyright (c) 2020 fren_gor - All rights reserved.

package com.fren_gor.ultimateScoreboards.api.lines;

import com.fren_gor.ultimateScoreboards.api.Line;

import java.util.Collection;
import java.util.List;

public interface StepLine extends Line {

    List<String> getLines();

    void setLines(Collection<String> steps);

    int getSteps();


}
