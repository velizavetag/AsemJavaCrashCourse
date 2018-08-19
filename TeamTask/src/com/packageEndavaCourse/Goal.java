package com.packageEndavaCourse;

public class Goal {

    private Team scoringTeam;
    private Player scoringPlayer;
    private double time;



    public Goal(Team scoringTeam, Player scoringPlayer, double time) {
        this.scoringTeam = scoringTeam;
        this.scoringPlayer = scoringPlayer;
        this.time = time;



    }



    public Team getScoringTeam() {
        return scoringTeam;
    }

    public Player getScoringPlayer() {
        return scoringPlayer;
    }

    public double getTime() {
        return time;
    }


}
