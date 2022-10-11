package com.example.springKaiser;

import com.example.springKaiser.school.Repository.GradeRepository;
import com.example.springKaiser.school.Repository.TeacherRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@Builder
public class YoutubeFeedManagerApplication {

	@Autowired
	GradeRepository gradeRepository;

	@Autowired
	TeacherRepository teacherRepository;

	public static void main(String[] args) {
		SpringApplication.run(YoutubeFeedManagerApplication.class, args);
	}

//	@Bean
//	ApplicationRunner init(StudentsRepository repository) {
//
//		String[][] data = {
//				{"1", "Andrew", "andrew@andrew.com", "1", "1"},
//				{"2", "Charlie", "charlie@whyamIhere.com", "2", "2"},
//				{"3", "Kai", "kai@kaifactory.com", "1", "3"}
//		};
//
//		return args -> {
//			Stream.of(data).forEach(array -> {
//				try {
//					Students students = new Students(
//							Integer.parseInt(array[0]),
//							array[1],
//							array[2],
//							gradeRepository.findById(Integer.parseInt(array[3])).get(),
//							teacherRepository.findById(Integer.parseInt(array[4])).get()
//					);
//					repository.save(students);
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}

//	@Bean
//	ApplicationRunner initSubscriber(SubscriberRepository repository) {
//
//		String[][] data = {
//				{"1", "Andrew"},
//				{"2", "Charlie"},
//				{"3", "Kai"},
//				{"4", "Matthew"},
//				{"5", "Hyper Potions"}
//		};
//
//		return args -> {
//			Stream.of(data).forEach(array -> {
//				try {
//					Subscriber subscriber = new Subscriber(
//							Integer.parseInt(array[0]),
//							array[1]
//					);
//					repository.save(subscriber);
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}

//	@Bean
//	ApplicationRunner initVideo(VideoRepository repository) {
//
//		String[][] data = {
//				//ID, video name, comments, likes, Channel name, views
//				{"0", "Ya Boy Kongming! OP / Opening「UHD 60FPS」", "4576", "107000", "TriaxFx", "3490574"},
//				{"1", "Apex Legends: Saviors Launch Trailer", "12340", "201000", "Apex Legends", "4958136"},
//				{"2", "Apex Legends | Stories from the Outlands - Hero", "3760", "114000", "Apex Legends", "2349878"},
//				{"3", "Be Crazy for Me - Ya Boy Kongming! - Official Video Song | AniTV", "323", "9600", "AniTV", "201747"},
//				{"4", "Character Demo - Zhongli: The Listener | Genshin Impact", "44955", "461000", "Genshin Impact", "27099025"},
//				{"5", "Character Demo - Ganyu: Radiant Dreams | Genshin Impact", "14445", "205000", "Genshin Impact", "6995270"},
//				{"6", "Test", "1", "2", "testing", "3"}
//		};
//
//		return args -> {
//			Stream.of(data).forEach(array -> {
//				try {
//					Video video = new Video(
//							Integer.parseInt(array[0]),
//							array[1],
//							Integer.parseInt(array[2]),
//							Integer.parseInt(array[3]),
//							array[4],
//							Integer.parseInt(array[5])
//					);
//					repository.save(video);
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}
}
