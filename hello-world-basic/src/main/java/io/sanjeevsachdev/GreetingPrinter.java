/**
 * 
 */
package io.sanjeevsachdev;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Sanjeev Sachdev
 *
 */
@Component
public class GreetingPrinter {
	final private Scanner scanner = new Scanner(System.in);
	final private GreetingService greetingService;
	
    @Autowired
    public GreetingPrinter(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void printGreeting() {
		while (true) {
			System.out.print("Please enter your name or type 'exit' to quit: ");
			String name = scanner.next();
			if(name.equalsIgnoreCase("exit")){
				System.exit(0);
			}			
			System.out.println(this.greetingService.getGreeting(name).getText());
		}
    }
}