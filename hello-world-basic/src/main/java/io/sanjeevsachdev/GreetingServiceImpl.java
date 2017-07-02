/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.stereotype.Service;

/**
 * @author Sanjeev Sachdev
 * 
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	private static final String greetingTemplate = "Hello, %s!";
	private static final String defaultName = "World";

	public Greeting getGreeting(String name) {
		if (name == null) {
			name = defaultName;
		}
		return new Greeting(String.format(greetingTemplate, name));
	}
}