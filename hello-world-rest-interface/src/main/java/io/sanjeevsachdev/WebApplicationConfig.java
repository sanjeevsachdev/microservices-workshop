/**
 * 
 */
package io.sanjeevsachdev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Sanjeev Sachdev
 * 
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "io.sanjeevsachdev")
public class WebApplicationConfig {

}