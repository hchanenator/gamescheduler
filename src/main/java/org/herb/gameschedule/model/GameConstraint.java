/**
 * 
 */
package org.herb.gameschedule.model;

/**
 * @author herb
 *
 */
public class GameConstraint implements I_Constraint {
	
	private boolean active = false;
	

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_Constraint#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_Constraint#enable()
	 */
	@Override
	public void enable() {
		active = true;

	}

	/* (non-Javadoc)
	 * @see org.herb.gameschedule.model.I_Constraint#disable()
	 */
	@Override
	public void disable() {
		active = false;

	}

}
