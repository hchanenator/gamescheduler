/**
 * 
 */
package org.herb.gameschedule.model;

import java.util.Date;

/**
 * @author herb
 * Represents a schedule event such as a game or
 * practice
 */
public interface I_ScheduleEvent {
	
	String getEventName();
	Date getEventDate();
	int getEventTime();
	EventType getEventType();
}
