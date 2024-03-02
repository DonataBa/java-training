package oop;

public class Demo {

	public static void main(String[] args) {
		// creating new object person1

		Person person1 = new Person();
		Person person2 = new Person("Anna");
		
		person1.name = "Jack";
		person1.walk();
		person2.walk();
	}

}
