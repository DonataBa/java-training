package oop;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student student1 = new Student("123456", "Jack");
		student1.setCity("Boston");
		student1.setState("NY");
		student1.setPhone("123-123-123");
		student1.pay(250);
		student1.enroll("Math");
		student1.enroll("Art");
		student1.enroll("English");
		student1.checkBalance();
		
		System.out.println(student1.toString());
		student1.showCourses();
		
		Student student2 = new Student("123432", "Anna");
		Student student3 = new Student("123777", "Thomas");
	}

}

 class Student {
	
	String name;
	private static int ID = 1000;
	private String SSN;
	private String userId;
	private String phone;
	private String city;
	private String state;
	private double balance;
	private String email;
	String[] courses = new String[6];
	
	Student(String SSN, String name){
		ID++;
		this.SSN = SSN;
		this.name = name;
		setEmail();
		generateId();
	}
	
	private void setEmail() {
		email = name.toLowerCase()+"."+ID + "@university.com";
		System.out.println("Your email: "+email);
	}
	
	private void generateId() {
		userId = ID +""+( (int)(Math.random()*10000))+""+ SSN.substring(SSN.length() -4);
		System.out.println("Your user ID: "+userId);
		
	}
	
	public void enroll(String course) {
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] == null) {
				courses[i] = course;
				balance = balance + 500;
				break;
			}
		}
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("You've paid: "+amount);
	}
	
	public void checkBalance() {
		System.out.println("Your balance: "+balance);
	}
	
	public void showCourses() {
		System.out.println("You enrolled into courses:");
		for (int i = 0; i < courses.length; i++) {
			if (courses[i] != null) {
		System.out.println(courses[i]);
		} else {
			break;
		}
		}
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\nUser ID: "+userId+"\nBalance: "+balance;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}