package com.bae.vehicles;

public class Motorbike extends Vehicle {

	private String colour = "Red";

	public Motorbike() {
		super();
	}


	public Motorbike(String make, String model, int doors, int speed, int wheels, int id) {
		super(make, model, doors, speed, wheels, id);
		// TODO Auto-generated constructor stub
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public double calculateBill() {
		double bill = (109 * this.getWheels());
		return bill;
	}

}
