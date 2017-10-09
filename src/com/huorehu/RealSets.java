package com.huorehu;

import java.util.List;
import java.util.ArrayList;

public class RealSets {

    private List<RealInterval> realSets = new ArrayList<>();

    public RealSets(final RealInterval ... realInterval) {
        for(RealInterval realTemp : realInterval) {
            this.realSets.add(realTemp);
        }
    }

} 
