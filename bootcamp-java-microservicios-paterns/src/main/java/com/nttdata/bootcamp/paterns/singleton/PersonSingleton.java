package com.nttdata.bootcamp.paterns.singleton;

public class PersonSingleton {
	private static PersonSingleton person;
	private String name;
	private int age;
	
	private PersonSingleton() {
		
	}
	
	private PersonSingleton(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static PersonSingleton getInstance(String name, int age) {
		if(person == null) {
			person = new PersonSingleton(name, age);
		}
		
		return person;
	}
	
	public void singleOperation() {
		System.out.println("My name is "+name+" and my age is "+age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
