package com.bae.vehicles;

public class Tractor extends Vehicle {

	private int horsepower = 308;

	// Constructors

	public Tractor() {
		super();
	}

	public Tractor(String make, String model, int doors, int speed, int wheels, int id) {
		super(make, model, doors, speed, wheels, id);
	}

	@Override
	public double calculateBill() {
		double bill = (380 * this.getWheels()) + (290 * this.getDoors());
		return bill;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}


}
