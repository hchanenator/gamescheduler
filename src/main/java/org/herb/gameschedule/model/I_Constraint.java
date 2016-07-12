/**
 * Represents some sort of event constraint such as time or location
 * 
 */
package org.herb.gameschedule.model;

/**
 * @author herb
 *
 */
public interface I_Constraint {

	public boolean isEnabled();
	public void enable();
	public void disable();
	
}
