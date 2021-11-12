package com.bae.vehicles;

public class Car extends Vehicle {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String colour = "Black";

	public Car(String make, String model, int doors, int speed, int wheels, int id) {
		super(make, model, doors, speed, wheels, id);

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public double calculateBill() {
		double bill = (120 * this.getWheels()) + (250 * this.getDoors());
		return bill;

	}

}
