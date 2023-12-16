package org.teamA04.iso;

public class App {
	public static void main(String[] args) {
		try {
			double mass1 = Utils.readDouble("Enter the mass of the first body: ");
			double mass2 = Utils.readDouble("Enter the mass of the second body: ");
			double distance = Utils.readDouble("Enter the distance between the bodies: ");
			
			GravitationalForceCalculator gravitationalForce = new GravitationalForceCalculator(mass1, mass2, distance);

			double force = gravitationalForce.calculateForce();
			System.out.println("The gravitational force between the bodies is " + force + " N.");

		} catch (InvalidMassException e) {
			System.out.println("Invalid Mass Error: " + e.getMessage());
		} catch (InvalidDistanceException e) {
			System.out.println("Invalid Distance Error: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid number.");
		}
	}
}
