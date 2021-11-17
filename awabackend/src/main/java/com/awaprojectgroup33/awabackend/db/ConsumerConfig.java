package com.awaprojectgroup33.awabackend.db;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {

    @Bean
		CommandLineRunner commandLineRunner(ConsumerRepository consumerRepository) {
			return args -> {
				Consumer donald = new Consumer("Donald", "Duck", "donald.duck@test.com", "1234");
				Consumer bob = new Consumer("Bob", "Builder", "bob.builder@test.com", "0000");
				
                consumerRepository.saveAll(List.of(donald, bob));

			};

		
	}
    
}
