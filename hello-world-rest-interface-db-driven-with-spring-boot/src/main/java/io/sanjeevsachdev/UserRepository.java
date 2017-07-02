/**
 * 
 */
package io.sanjeevsachdev;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Sanjeev Sachdev
 * 
 */
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByLastName(String lastName);
}
