package SkyluxSky;

/*The earlier a bug is spotted in the code the easier it is to fix!*/

public class Main {

    public static void main(String[] args) {
        //Creates Players
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Creates Team of Football Players
        //Team<T> = Team<FootballPlayer>
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        //Creates Team of Baseball Players
        //Team<T> = Team<BaseballPlayer>
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());


        Team<SoccerPlayer> soccerTeam = new Team<>("Chicago Cubs");
        soccerTeam.addPlayer(beckham);
        System.out.println(soccerTeam.numPlayers());

        //Broken Team
        //Team<String> brokenTeam = new Team<>("This does not work");
        //brokenTeam.addPlayer("no-one");

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordan");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorne = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorne.matchResult(fremantle,1,0);
        hawthorne.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
        //adelaideCrows.matchResult(baseballTeam, 1,1); //Error


    }
}
