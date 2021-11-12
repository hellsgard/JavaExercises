package com.bae.vehicles;

public abstract class Vehicle {



	private String make;
	private String model;
	private int doors;
	private int speed;
	private int wheels;
	private int id;

	public Vehicle() {
		super();
	}

	public Vehicle(String make, String model, int doors, int speed, int wheels, int id) {
		super();
		this.make = make;
		this.model = model;
		this.doors = doors;
		this.speed = speed;
		this.wheels = wheels;
		this.id = id;
	}

	public abstract double calculateBill();


	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", doors=" + doors + ", speed=" + speed + ", wheels="
				+ wheels + ", id=" + id + "]";
	}


}
