package com.bnta.exercise.week4_mon.sports_team;

import com.bnta.exercise.week4_mon.sports_team.pojos.Manager;
import com.bnta.exercise.week4_mon.sports_team.pojos.Player;
import com.bnta.exercise.week4_mon.sports_team.pojos.Team;

public class Main {

    public static void main(String[] args) {

        Player player=new Player("Finn Russell","fly half",10,10);
        Manager manager = new Manager("Gregor Townsend");
        Team soctland = new Team("scotland",manager);



        System.out.println(player);

        TeamService teamService=new TeamService();
        int count = teamService.countEmptySpaceOnTeam(soctland);
        System.out.println(count);

        int spacebefore = teamService.countEmptySpaceOnTeam(soctland);
        try {
            teamService.addPlayerToTeam(soctland,player);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        int spaceAfter = teamService.countEmptySpaceOnTeam(soctland);
        System.out.println(spacebefore);
        System.out.println(spaceAfter);


    }

}
