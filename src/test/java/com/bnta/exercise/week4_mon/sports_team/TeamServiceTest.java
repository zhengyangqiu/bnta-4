package com.bnta.exercise.week4_mon.sports_team;

import com.bnta.exercise.week4_mon.sports_team.pojos.Manager;
import com.bnta.exercise.week4_mon.sports_team.pojos.Player;
import com.bnta.exercise.week4_mon.sports_team.pojos.Team;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeamServiceTest {

    @Test
    public void canCountEmptySpacesOnTeamWhenEmpty(){
        //Given
        Manager manager= new Manager("test manager");
        Team team=new Team("team1",manager);
        TeamService underTest = new TeamService();
        //When
        int actual = underTest.countEmptySpaceOnTeam(team);

        //Then
        int expected =15;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void canCountEmptySpacesOnTeamWithOnePlayer() throws Exception {
        //Given
        Manager manager= new Manager("test manager");
        Team team=new Team("team1",manager);
        TeamService underTest = new TeamService();
        Player player= new Player("Test player","winger",11,2);
        underTest.addPlayerToTeam(team,player);

        //When
        int actual = underTest.countEmptySpaceOnTeam(team);
        //Then
        int expected =14;
        assertThat(actual).isEqualTo(expected);




    }









}