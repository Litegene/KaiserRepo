package com.example.springKaiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeFeedManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeFeedManagerApplication.class, args);
		System.out.println("lol");
		int youtubeFeedCount = returnYoutubeFeed();
		System.out.println(youtubeFeedCount);
		String youtubeDescription = returnYoutubePics();
	}

	public static int returnYoutubeFeed(){
		return 8;
	}

	public static String returnYoutubePics() {
		return "Yes";
	}

}
