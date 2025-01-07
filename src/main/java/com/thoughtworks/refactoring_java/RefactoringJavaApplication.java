package com.thoughtworks.refactoring_java;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RefactoringJavaApplication {

	public static final String S = "Hello, %s!";
	public static final String S1 = "Please enter your name: ";

	public static void main(String[] args) {
		Scanner s = getScanner();

		System.out.print(S1);

		String n = doSomething(s);

		String g = doSomeMore(n);

		System.out.println(g);

		s.close();
	}

	private static String doSomeMore(String n) {
		String g = String.format(S, n);
		return g;
	}

	private static String doSomething(Scanner s) {
		String n = s.nextLine();
		return n;
	}

	private static Scanner getScanner() {
		Scanner s = new Scanner(System.in);
		return s;
	}
}
