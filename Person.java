package com.qa.helloworld;

public class Person {

	private String name;
	private int age;
	private double height;
	private int shoesize;
	private String jobTitle;


	
	

	public Person(String name, int age, double height, int shoesize, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.shoesize = shoesize;
		this.jobTitle = jobTitle;
	}
	
	

	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}



	public void intro() {
		System.out.println("Hello I'm " + name + " and I am a " + age + " year old " + jobTitle);
	}

	public void intro2() {
		System.out.println("My name is " + name + " I am " + height + "cm tall, and my shoe size is " + shoesize);

	}
	
	}


