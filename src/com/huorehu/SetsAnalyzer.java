package com.huorehu;

import java.util.List;
import java.util.ArrayList;

public class SetsAnalyzer {

    private List<RealSets> setsList = new ArrayList<>();  
    
    public SetsAnalyzer() {
        RealInterval realOne = new RealInterval(5,12);

        RealInterval realTwo = new RealInterval(0, 7);
        RealInterval realThree = new RealInterval(11, 17);

        RealInterval realFour =new RealInterval(0,9);

        setsList.add(new RealSets(realOne));
        setsList.add(new RealSets(realTwo, realThree));
        setsList.add(new RealSets(realFour));
    }
    public int getMergeNumber() {
	return 0;    
    }

}
