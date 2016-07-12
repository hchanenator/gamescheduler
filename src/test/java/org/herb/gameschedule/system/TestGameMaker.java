/**
 * 
 */
package org.herb.gameschedule.system;

import static  org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.herb.gameschedule.GameSchedulerMainConfig;
import org.herb.gameschedule.model.Game;
import org.herb.gameschedule.model.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author herb
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {GameSchedulerMainConfig.class})
public class TestGameMaker {
	private List<Game> games = new ArrayList<Game>();
	
	@Autowired
	GameMaker maker;
	
//	@Test
	public void testGameMaker() {
		
		List<Team> teams = new ArrayList<Team>();
		teams.add(new Team("Leafs"));
		teams.add(new Team(1L, "Habs"));
		teams.add(new Team(2L, "Bruins"));
		
		List<Game> games = maker.simpleScheduleMaker(teams);
		assertNotNull(games);
		assertEquals(2, teams.size());
		
		listGames(games);
	}
	
	private void listGames(List<Game> games) {
		for (Game game : games) {
			System.out.println(game.toString());
		}
	}
	
	@Test
	public void testHomeGameMaker() {
		List<Team> teams = new ArrayList<Team>();
		teams.add(new Team(0L, "Leafs"));
		teams.add(new Team(1L, "Canadiens"));
		teams.add(new Team(2L, "Bruins"));
		teams.add(new Team(3L, "Blackhawks"));
		teams.add(new Team(4L, "Red Wings"));
		teams.add(new Team(5L, "Rangers"));
		
		for (Team homeTeam : teams) {
			maker.homeTeamScheduleMaker(homeTeam, teams, games);
		}
		
		listGames(games);
	}

}
