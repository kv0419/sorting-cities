package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class CompoundComparator implements Comparator<City> {
    @Override
    public int compare(City a, City b) {
        //compare by state
        //compare by population
        int stateCompare = a.getState().compareTo(b.getState());
        if (stateCompare !=0){
            return stateCompare;
        } else
                {
                    return Integer.compare(b.getPopulation(),a.getPopulation());
            }
    }
}
