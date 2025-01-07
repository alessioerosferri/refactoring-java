package com.thoughtworks.refactoring_java;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RefactoringJavaApplication {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter their name
		System.out.print("Please enter your name: ");

		// Read the user's name
		String nameOfUser = scanner.nextLine();

		// Print the greeting message
		System.out.println("Hello, " + nameOfUser + "!");

		// Close the scanner
		scanner.close();
	}
}
