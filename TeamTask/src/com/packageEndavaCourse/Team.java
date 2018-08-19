package com.packageEndavaCourse;

import java.util.List;

public class Team {

    private String name;

    private List<Player> playerList;


    public Team(String name, List<Player> playerList) {
        this.name = name;
        this.playerList = playerList;
    }



    public String getName() {
        return name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void printTeam(){
        System.out.println("Players from " + this.name);
        for (Player player : playerList){

            System.out.println(" Name : " + player.getPlayerName() + "\t " + "Second name: "+ player.getPlayerSecondName());
        }

        System.out.println();
    }
}
