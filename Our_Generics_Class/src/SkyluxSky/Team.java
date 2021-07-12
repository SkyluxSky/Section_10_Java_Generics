package SkyluxSky;

import java.util.ArrayList;

public class Team {
    //Fields
    private String name; //Name of the team
    int played = 0; //Games Played
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>(); //Members of team... (Using Generics<>)

    //Constructor
    public Team(String name) {
        this.name = name;
    }

    //Methods
    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on the team!");
            return false;

        } else {
            members.add(player);//Add Player
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;

        }
    }

    //Getter for returning the size of the arraylist
    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        } else if (ourScore == theirScore){
            tied++;
        } else {
            lost++;
        }
        played++; //Increase total games played.

        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore); //saves score to opponents team
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
