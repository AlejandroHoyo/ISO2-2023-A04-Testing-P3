package org.teamA04.iso;

public class GravitationalForceCalculator {

	private double mass1;
	private double mass2;
	private double distance;

	public GravitationalForceCalculator(double mass1, double mass2, double distance) {
		this.mass1 = mass1;
		this.mass2 = mass2;
		this.distance = distance;
	}
	public double getMass1() {
		return mass1;
	}

	public double getMass2() {
		return mass2;
	}

	public double getDistance() {
		return distance;
	}
	public double calculateForce() throws NonPositiveDistanceOrMassException {
		if (mass1 > 0 && mass2 > 0 && distance > 0) 
			return Utils.GRAVITATIONAL_CONSTANT * (mass1 * mass2) / Math.pow(distance, 2);
		else
			throw new NonPositiveDistanceOrMassException("Value must be greater than 0.");
	}
}
