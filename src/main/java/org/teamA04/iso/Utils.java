package org.teamA04.iso;

import java.util.Scanner;

public class Utils {
	public static final double GRAVITATIONAL_CONSTANT = 6.674 * Math.pow(10, -11);
	
	public static final Scanner KEYBOARD = new Scanner(System.in);

	public static double readDouble(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Double.parseDouble(KEYBOARD.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
}
