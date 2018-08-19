package com.packageEndavaCourse;

import java.util.ArrayList;
import java.util.List;

public class League {
    public static void main(String[] args) {



//        Instantiating players for team one (Russia)


        List<Player> playerListRussia = new ArrayList<>();

        Player player11 = new Player("Igor" , "Akinfeev");
        Player player12 = new Player("Artem" , "Dzyuba");
        Player player13 = new Player("Yuri" , "Zhirkov");
        Player player14 = new Player("Fyodor" , "Kudryashov");
        Player player15 = new Player("Ahmed" , "Fathy");
        Player player16 = new Player("Denis" , "Cheryshev");

        playerListRussia.add(player11);
        playerListRussia.add(player12);
        playerListRussia.add(player13);
        playerListRussia.add(player14);
        playerListRussia.add(player15);
        playerListRussia.add(player16);
        Team teamRussia = new Team("Russia", playerListRussia);
        teamRussia.printTeam();
        System.out.println("==========================================");



//        Instantiating players for team two (Egypt)

        List<Player> playerListEgypt = new ArrayList<>();

        Player player21 = new Player("Mohamed", "Salah");
        Player player22 = new Player("Mohamed", "Salah");
        Player player23 = new Player("Mahmoud", "Hassan");
        Player player24 = new Player("Mohamed", "Elnemy");
        Player player25 = new Player("Abdallah", "Said");
        Player player26 = new Player("Ahmed", "Hegazi");
        playerListEgypt.add(player21);
        playerListEgypt.add(player22);
        playerListEgypt.add(player23);
        playerListEgypt.add(player24);
        playerListEgypt.add(player25);
        playerListEgypt.add(player26);

        Team teamEgypt = new Team("Egypt", playerListEgypt);
        teamEgypt.printTeam();
        System.out.println("==========================================");


//      The game
        Game theGame = new Game(teamRussia, teamEgypt);
        theGame.addGoal(new Goal(teamRussia, player15, 47));
        theGame.addGoal(new Goal(teamRussia, player12, 59));
        theGame.addGoal(new Goal(teamRussia, player12, 62));
        theGame.addGoal(new Goal(teamEgypt, player21, 73));

        printGoals(theGame.getGoals());

        printScore(theGame);





    }


    public static void printGoals(List<Goal> goal){

        for (Goal goals : goal){
            System.out.println("Team : " +goals.getScoringTeam().getName() + ". \tPlayer: " + goals.getScoringPlayer().getPlayerName() + " "+
                                goals.getScoringPlayer().getPlayerSecondName()  );
            System.out.println("Time: " + goals.getTime());
            System.out.println("=====================================================================");
        }


    }

    public static void printScore(Game game){
        System.out.println(game.getHomeTeam().getName() + " \t" + game.getScoreteamHome() + " \t:\t " +
                game.getScoreteamAway() + "\t" + game.getAwayTeam().getName() );

    }

}
