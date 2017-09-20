package de.codeboje.springboot.tutorials.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingTutorialApplication.class, args);
	}
}
