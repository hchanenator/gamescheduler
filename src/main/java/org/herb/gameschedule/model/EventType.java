/**
 * 
 */
package org.herb.gameschedule.model;

/**
 * @author herb
 * Represents the various types of events
 */
public enum EventType {

	GAME(1, "Game"),
	PRACTICE(2, "Practice"),
	LESSON(3, "Lesson");
	
	private String eventName;
	private int eventID;
	
	EventType(int eventID, String eventName) {
		this.eventID = eventID;
		this.eventName = eventName;
	}
	
	
	public String getEventName() {
		return eventName;
	}
	
	public int getEventID() {
		return eventID;
	}
}
