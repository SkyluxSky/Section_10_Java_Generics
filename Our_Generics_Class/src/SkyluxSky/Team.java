package SkyluxSky;

import java.util.ArrayList;
import java.util.List;

//Adds type parameter
//When we instantiated a class the T is changed to perform type checking.
//Sets up a Default type that can be reassigned
//using the extends keyword allows us to restrict T to only accept a certain class
//Accepts any class that is Player or Extends Player(Player is the upper bound)
public class Team<T extends Player> {
    //Fields
    private String name; //Name of the team
    int played = 0; //Games Played
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>(); //Members of team... (Using Generics<>)

    //Constructor
    public Team(String name) {
        this.name = name;
    }

    //Methods
    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){//& Coach & Managers (Syntax for adding multiple bounds)
        if(members.contains(player)){
            //Generics Type Casting
            System.out.println(((Player)player).getName() + " is already on the team!");
            return false;

        } else {
            members.add(player);//Add Player
            //With a boundary set on the variable <T> we can discard type casting.
            System.out.println(player.getName() + " picked for the team " + this.name);
            return true;

        }
    }

    //Getter for returning the size of the arraylist
    public int numPlayers() {
        return this.members.size();
    }

    //Argument utilizes generic type to ensure that correct team is passed
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;

        if (ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++; //Increase total games played.

        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName()); //Prints results
            opponent.matchResult(null, theirScore, ourScore); //saves score to opponents team
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}
