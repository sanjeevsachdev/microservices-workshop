/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sanjeev Sachdev
 * 
 */
@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		GreetingPrinter greetingPrinter = context.getBean(GreetingPrinter.class);	
		greetingPrinter.printGreeting();
	}
}