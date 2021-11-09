package com.qa.helloworld;

public class Runner {

	public static void main(String[] args) {

		Person ryan = new Person("Ryan", 35, 180, 10, "Builder");
		Person zoe = new Person("Zoe", 2, 97, 5, "Unemployed person");
		Person charlie = new Person("Charlie", 39, 190, 12, "Platform engineer");
		Person helen = new Person("Helen", 176);

		charlie.intro();
		zoe.intro2();


	}

}
