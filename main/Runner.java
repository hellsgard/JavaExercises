package com.bae.main;

import com.bae.garage.Garage;
import com.bae.vehicles.Car;
import com.bae.vehicles.Motorbike;
import com.bae.vehicles.Tractor;

public class Runner {

	public static void main(String[] args) {

		Car tesla = new Car("Tesla", "Roadster", 3, 250, 4, 15);
		Motorbike ducati = new Motorbike("Ducati", "Scrambler 1100", 0, 130, 2, 10);
		Tractor deere = new Tractor("John Deere", "8RT", 2, 42, 4, 5);

		Garage g = new Garage();

		g.addVehicle(tesla);
		g.addVehicle(deere);
		g.addVehicle(ducati);

		g.printVehicles();

		g.fixVehicle();

//		g.clearGarage();

		g.removeByMake("Ducati");


	}

}
