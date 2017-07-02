/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanjeev Sachdev
 * 
 */
@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";

	@Autowired
	UserRepository userRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/users/{userId}/greeting")
	public Greeting greeting(@PathVariable Long userId) {
		String name = "World";

		User user = userRepository.findOne(userId);

		if (user != null) {
			name = user.getFirstName() + " " + user.getLastName();
		}

		return new Greeting(String.format(template, name));
	}
}