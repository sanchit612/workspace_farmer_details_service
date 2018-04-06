package com.kkd.farmerdetailsservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.kkd.farmerdetailsservice.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				userRepository.save(new User(1,"Peter","Development",3000L))
			}
		};
	}
	
	

}
