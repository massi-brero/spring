package de.massisoft.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.massisoft.spring.domain.Journal;
import de.massisoft.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournalApplication {

	@Bean
	InitializingBean saveData(JournalRepository repo) {
		return () -> {
			repo.save(new Journal("Get to know Spring Boot","Today I will learn SpringBoot","01/01/2016"));
			repo.save(new Journal("Simple Spring Boot Project","I will do my first SpringBoot Project","01/02/2016"));
			repo.save(new Journal("Spring Boot Reading","Read more about SpringBoot","02/01/2016"));
			repo.save(new Journal("Spring Boot in the Cloud","Spring Boot using CloudFoundry","03/01/2016"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}

}
