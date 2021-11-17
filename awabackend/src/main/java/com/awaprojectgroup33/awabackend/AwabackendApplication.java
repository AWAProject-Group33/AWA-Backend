package com.awaprojectgroup33.awabackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.awaprojectgroup33.awabackend.db.Consumer;
import com.awaprojectgroup33.awabackend.db.ConsumerRepository;
import com.awaprojectgroup33.awabackend.db.dbConnect;

@SpringBootApplication
public class AwabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwabackendApplication.class, args);

		//dbConnect dbObject = new dbConnect();
		//dbObject.connectionMethod();

		//Consumer consumerObject = new Consumer();
		//consumerObject.selectConsumer();

		}

/*
		@Bean
		CommandLineRunner commandLineRunner(ConsumerRepository consumerRepository) {
			return args -> {
				Consumer donald = new Consumer("Donald", "Duck", "donald.duck@test.com", "123");
				Consumer bob = new Consumer("Bob", "Builder", "bob.builder@test.com", "000");
				consumerRepository.save(donald);
				consumerRepository.save(bob);

			};

		
	}*/

}
