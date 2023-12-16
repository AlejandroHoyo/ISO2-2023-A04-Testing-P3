package org.teamA04.iso;

import java.util.Scanner;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

	public static double readDouble(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
}
