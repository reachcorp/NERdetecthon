package com.reachcorp.reach.NERdetecthon.dto.entities.insight;

import java.util.List;

/**
 * Created by gFolgoas on 05/03/2019.
 */
public abstract class InsightEntity {
    private List<Integer> textPositionInfo;

    public List<Integer> getTextPositionInfo() {
        return textPositionInfo;
    }

    public void setTextPositionInfo(List<Integer> textPositionInfo) {
        this.textPositionInfo = textPositionInfo;
    }
}
