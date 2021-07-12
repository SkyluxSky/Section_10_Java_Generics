package SkyluxSky;

public abstract class Player {
    //Field
    private String name; //Name of the player

    //Constructor
    public Player(String name) {
        this.name = name;
    }

    //Methods
    public String getName(){
        return name;
    }
}
