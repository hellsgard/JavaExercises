package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<>();

		animals.add("tiger");
		animals.add("elephant");
		animals.add("sloth");
		animals.add("mouse");
		animals.add("goat");
		animals.add("horse");
		animals.add("monkey");
		animals.add("lion");
		animals.add("sheep");
		animals.add("dog");

		System.out.println(animals);

		for (String i : animals) {
			System.out.println(i);

		}

		System.out.println(animals.get(1));

		animals.set(3, "duck");
		System.out.println(animals);

		animals.set(4, "octopus");
		System.out.println(animals);

		Collections.sort(animals);
		System.out.println(animals);

		Collections.reverse(animals);
		System.out.println(animals);


	}

}
