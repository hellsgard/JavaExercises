package com.bae.garage;

import java.util.ArrayList;
import java.util.List;

import com.bae.vehicles.Vehicle;

public class Garage {

	// public Vehicle(String make, String model, int doors, int speed, int wheels,
	// int id)


	// ARRAY LIST = vehicleList

	public List<Vehicle> vehicleList = new ArrayList<>();

	// Add Vehicles
	public void addVehicle(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}

	// Remove Vehicles
	public void removeVehicle(Vehicle vehicle) {
		this.vehicleList.remove(vehicle);

	}

	public void printVehicles() {
		for (Vehicle v : this.vehicleList) {
			System.out.println(v);

		}
	}

	public void printSpeed() {
		for (Vehicle v : this.vehicleList) {
			System.out.println(v.getSpeed());
		}
	}

	// Bill / Fix vehicle
	public void fixVehicle() {
		for (Vehicle v : this.vehicleList) {
			System.out.println("The cost to fix the " + v.getMake() + " is £" + v.calculateBill());
		}

	}

	public void clearGarage() {
		for (Vehicle v : vehicleList) {
			this.vehicleList.remove(v);
			System.out.println(vehicleList);
		}
	}

	public void removeByMake(String make) {
		List<Vehicle> removeList = new ArrayList<>();
		for (Vehicle v : this.vehicleList) {
			if (v.getMake() == make) {
				removeList.add(v);
			}

		}
		this.vehicleList.remove(removeList);
		System.out.println("All " + make + "s are removed");
		System.out.println(vehicleList);

	}




}
