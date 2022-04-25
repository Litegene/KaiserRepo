package com.example.springKaiser;

import com.example.springKaiser.entities.Students;
import com.example.springKaiser.repositories.StudentRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.stream.Stream;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class YoutubeFeedManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeFeedManagerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(StudentRepository repository) {

		String[][] data = {
				{"1", "Andrew", "andrew@andrew.com"},
				{"2", "Charlie", "charlie@whyamIhere.com",},
				{"3", "Kai", "kai@kaifactory.com",}
		};

		return args -> {
			Stream.of(data).forEach(array -> {
				try {
					Students students = new Students(
							Integer.parseInt(array[0]),
							array[1],
							array[2]
					);
					repository.save(students);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
