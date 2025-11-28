package com.blil.runnerz;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.blil.runnerz.run.run;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {


	}
   @Bean
   CommandLineRunner runner() {
	   return args -> {
		/**
		 * Creates a new run instance with the specified details.
		 * Initializes a run object with ID 1, title "Morning Run", 
		 * starting today and ending 1 hour from now, covering 5 kilometers,
		 * and set to take place outdoors.
		 */
		   run run = new run(1, "Morning Run",LocalDate.now(), LocalDate.now().plus(1,ChronoUnit.HOURS),5, Location.OUTDOOR);
	   };
   }
}
