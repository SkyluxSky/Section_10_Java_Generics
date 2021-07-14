package SkyluxSky;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    //Adds team to league
    public boolean add(T team){
        if (league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        //Sorts league table - Links to Comparable Method
        Collections.sort(league);
        //Prints out league table
        for (T t : league){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
