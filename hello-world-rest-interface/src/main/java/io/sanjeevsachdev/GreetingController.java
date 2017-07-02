/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanjeev Sachdev
 * 
 */
@RestController
public class GreetingController {
	private static final String greetingTemplate = "Hello, %s!";

	@RequestMapping(method = RequestMethod.GET, value = "/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {		
		return new Greeting(String.format(greetingTemplate, name));
	}
}