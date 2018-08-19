package com.packageEndavaCourse;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private int scoreteamHome;
    private int scoreteamAway;

    private List<Goal> goals = new ArrayList<>();

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;

    }


    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }


    public  void addGoal(Goal goal){
        goals.add(goal);

         {
            if (goal.getScoringTeam() == homeTeam) {
                scoreteamHome++;
            } else if (goal.getScoringTeam() == awayTeam) {
                scoreteamAway++;
            }
        }
    }

    public int getScoreteamHome() {
        return scoreteamHome;
    }

    public int getScoreteamAway() {
        return scoreteamAway;
    }

    public final List<Goal> getGoals() {
        return goals;
    }

    public void printScore(){
        System.out.println("The score is: ");
        System.out.println(homeTeam.getName() + " \t:\t " + awayTeam.getName());
        System.out.println(scoreteamHome + " \t:\t " + scoreteamAway);


    }

}
