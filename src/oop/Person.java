package oop;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		System.out.println("New person is created");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("New person is created with name "+name);
	}
	
	void walk() {
		System.out.println(name+" is walking");
	}
	
	void eat() {
		System.out.println(name+" is eating");
	}

}
