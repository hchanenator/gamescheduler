/**
 * 
 */
package org.herb.gameschedule.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.herb.gameschedule.model.Game;
import org.herb.gameschedule.model.Team;
import org.springframework.stereotype.Component;

/**
 * @author herb
 *
 */
@Component
public class GameMaker {
	
	public List<Game> simpleScheduleMaker(List<Team> teams) {
		List<Game> games = new ArrayList<Game>();
		
		Team homeTeam = teams.get(0);
		teams.remove(0); // get rid of the current team
		for (Team awayTeam : teams) {
			games.add(new Game(homeTeam, awayTeam));
		}
		
		return games;
	}
	
	public void homeTeamScheduleMaker(Team homeTeam, List<Team> teams, List<Game> games) {
				
		for (Iterator<Team> iterator = teams.iterator(); iterator.hasNext();) {
			Team awayTeam = (Team) iterator.next();
			if( !homeTeam.equals(awayTeam)) {
				games.add(new Game(homeTeam, awayTeam));
			}
			
		}
		
	}

}
