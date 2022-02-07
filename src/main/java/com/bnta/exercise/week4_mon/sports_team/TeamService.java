package com.bnta.exercise.week4_mon.sports_team;

import com.bnta.exercise.week4_mon.sports_team.pojos.Player;
import com.bnta.exercise.week4_mon.sports_team.pojos.Team;

import java.util.Arrays;

public class TeamService {

    //pass dao to work with
    //count empty spaces on team
    //return int
    //parameters: Team,

    public int countEmptySpaceOnTeam(Team team){
        //temporary variable to store count

        int count = 0;
        // loop through players array and count null
        for (Player player: team.getPlayers()) {
            //if statement
            //if player is null, add one to count
            if (player == null){
                count++;
            }
        }
        //return count
        return count;

        //method 2

//        Player[] players = team.getPlayers();
//        for (int i = 0; i < players.length; i++) {
//            if (players[i]==null){
//                count++;
//            }
//        }
    }

    public void addPlayerToTeam(Team team, Player player)throws Exception{
        //check if there is empty space
        int space = countEmptySpaceOnTeam(team);
        if (space>0){
            //get players array from team
            Player [] players = team.getPlayers();

            //add player to first available empty space

            //loop through players array
            for (int i = 0; i < players.length; i++) {
                //if we find an empty space, add player then break
                if (players[i] == null){
                    players[i]=player;
                    break;
                }

            }








        }else{
            throw new Exception("team is full");
        }




    }






}
