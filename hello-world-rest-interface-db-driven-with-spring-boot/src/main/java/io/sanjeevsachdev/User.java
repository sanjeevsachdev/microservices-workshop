/**
 * 
 */
package io.sanjeevsachdev;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Sanjeev Sachdev
 * 
 */

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;

	/*
	 * The default constructor only exists for the sake of JPA. You won’t use it
	 * directly, so it is designated as protected.
	 */
	protected User() {
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, firstName='%s', lastName='%s']", id,
				firstName, lastName);
	}
}