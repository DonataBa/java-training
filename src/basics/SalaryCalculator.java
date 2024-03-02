package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		//lets create a variable to define our career
		//annual salary - rate * hoursPerWeek * weeks
		
		String career;
		System.out.println("Program is starting");
		career = "Software developer";
		System.out.println("My career is: "+career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a "+career+" at the rate of $"+rate+" is $"+salary+" per year.");
	}

}
