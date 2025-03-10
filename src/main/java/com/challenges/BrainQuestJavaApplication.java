package com.challenges;

import com.challenges.loops.Task1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrainQuestJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(BrainQuestJavaApplication.class, args);
		System.out.println("Hello World");

		Task1.task1();


	}

}
