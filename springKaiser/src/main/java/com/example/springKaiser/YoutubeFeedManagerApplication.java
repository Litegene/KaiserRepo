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
	}

	public static int returnYoutubeFeed(){
		return 9;
	}

}
