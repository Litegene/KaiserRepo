package com.example.springKaiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoutubeFeedManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeFeedManagerApplication.class, args);
		System.out.println("lol");
		int youtubeFeedCount = this.returnYoutubeFeed();
		System.out.println(youtubeFeedCount);
		String youtubeDescription = this.returnYoutubePics();
	}

	public static int returnYoutubeFeed(){
		return 10;
	}

	public String returnYoutubePics() {
		return "Yes"
	}

}
