package com.challenges;

import com.challenges.arrays.Task3;
import com.challenges.arrays.Task4;
import com.challenges.loops.Task1;
import com.challenges.loops.Task2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrainQuestJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(BrainQuestJavaApplication.class, args);
		System.out.println("Hello World");

//		Task1.task1();
//		Task2.task2();
//		Task3.task3();
		Task4.task4();


	}

}
