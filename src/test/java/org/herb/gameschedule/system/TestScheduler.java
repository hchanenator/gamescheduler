/**
 * 
 */
package org.herb.gameschedule.system;

import static org.junit.Assert.*;

import java.util.Date;

import org.herb.gameschedule.GameSchedulerMainConfig;
import org.herb.gameschedule.model.Game;
import org.herb.gameschedule.model.GameConstraint;
import org.herb.gameschedule.model.ScheduleEvent;
import org.herb.gameschedule.model.Team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author herb
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {GameSchedulerMainConfig.class})
public class TestScheduler {

	@Test
	public void testMakeScheduleEvent() {
		ScheduleEvent event = new ScheduleEvent("Test Game", new Date(2016, 07, 12), 7, new GameConstraint(), new Game(new Team("Leafs"), new Team("Habs")));
		assertNotNull(event);
		
		System.out.println(event.getEventType());
	}
}
