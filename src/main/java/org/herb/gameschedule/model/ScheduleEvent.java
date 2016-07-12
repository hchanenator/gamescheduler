/**
 * 
 */
package org.herb.gameschedule.model;

import java.util.Date;

/**
 * @author herb
 *
 */
public class ScheduleEvent implements I_ScheduleEvent {
	
	private String eventName;
	private Date eventDate;
	private int eventTime;
	private GameConstraint constraint;
	private I_Event event;
	
	

	/**
	 * @param eventName
	 * @param eventDate
	 * @param eventTime
	 * @param constraint
	 * @param event
	 */
	public ScheduleEvent(String eventName, Date eventDate, int eventTime, GameConstraint constraint, I_Event event) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.constraint = constraint;
		this.event = event;
	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_ScheduleEvent#getEventName()
	 */
	@Override
	public String getEventName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_ScheduleEvent#getEventDate()
	 */
	@Override
	public Date getEventDate() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the constraint
	 */
	public GameConstraint getConstraint() {
		return constraint;
	}

	/**
	 * @param constraint the constraint to set
	 */
	public void setConstraint(GameConstraint constraint) {
		this.constraint = constraint;
	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_ScheduleEvent#getEventTime()
	 */
	@Override
	public int getEventTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_ScheduleEvent#getEventType()
	 */
	@Override
	public EventType getEventType() {
		// TODO Auto-generated method stub
		return null;
	}

}
