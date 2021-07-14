// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.

package SkyluxSky;

public class Main {

    public static void main(String[] args) {

        //Instantiate League
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        //Instantiate Teams
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        //Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        //Add teams to league
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(fremantle);
        footballLeague.add(adelaideCrows);
        //footballLeague.add(baseballTeam); //Causes Error - T instantiated as footballPlayer

        hawthorne.matchResult(fremantle,1,0);
        hawthorne.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.showLeagueTable();

    }
}
