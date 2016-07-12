/**
 * Represents a Team
 */
package org.herb.gameschedule.model;

/**
 * @author herb
 *
 */
public class Team {
	
	private Long id;
	private String name;
	
	public Team(String name) {
		this(0L, name);
	}
	
	

	/**
	 * @param id
	 * @param name
	 */
	public Team(Long id, String name) {
		this.id = id;
		this.name = name;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
	
	

}
