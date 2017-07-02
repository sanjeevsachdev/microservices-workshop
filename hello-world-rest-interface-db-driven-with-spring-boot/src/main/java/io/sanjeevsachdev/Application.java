/**
 * 
 */
package io.sanjeevsachdev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Sanjeev Sachdev
 * 
 */

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			
			Iterable<User> users = repository.findAll();
			if(!users.iterator().hasNext()){
				repository.save(new User("Bill", "Gates"));
				repository.save(new User("Sachin", "Tendulkar"));
				repository.save(new User("Narendra", "Modi"));
				repository.save(new User("Mahendra", "Singh Dhoni"));
			}

			log.info("Users found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
		};
	}
}