package org.teamA04.iso;

public class GravitationalForceCalculator {
	public static final double GRAVITATIONAL_CONSTANT = 6.674 * Math.pow(10, -11);
    public static double calculateForce(double mass1, double mass2, double distance)
            throws InvalidMassException, InvalidDistanceException {

        if (mass1 <= 0 || mass2 <= 0) {
            throw new InvalidMassException("Mass must be greater than 0.");
        }
        if (distance <= 0) {
            throw new InvalidDistanceException("Distance must be greater than 0.");
        }

        double gravitationalConstant = 6.674 * Math.pow(10, -11);
        return gravitationalConstant * (mass1 * mass2) / Math.pow(distance, 2);
    }
}
