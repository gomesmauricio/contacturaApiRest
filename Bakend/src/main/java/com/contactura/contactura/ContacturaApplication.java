package com.contactura.contactura;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.contactura.contactura.model.Contactura;
import com.contactura.contactura.repository.ContacturaRepository;

@SpringBootApplication
public class ContacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContacturaApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ContacturaRepository repository){
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 10)
			.mapToObj( i -> {
				Contactura contactura = new Contactura();
				contactura.setName("Contactura User " + i);
				contactura.setEmail("contactura" + i + "@gmail.com");
				contactura.setPhone("(081) 9 " + i + i +i +i + "-" + i+i+i+i);
				return contactura;
			}).map(m -> repository.save(m))
			.forEach(System.out::println);
		};
	}
}