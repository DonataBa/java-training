package basics;

public class NumbersCals {
	public static void main (String[] args) {
		System.out.println("Program is starting");
		printName();
		int a = 10;
		int b = 20;
		addNumbers(a,b);
		System.out.println("Multiplication of a and b is equal: "+multiplyNumbers(a,b));
		
	}
	
	static void printName() {
		System.out.println("My name is Donata");
	}
	
	
	static void addNumbers(int a,int b) {
		int sum = a + b;
		System.out.println("Sum or number a and b is: "+sum);
		
	}
	
	static int multiplyNumbers(int a, int b){
		return a*b;
	}

}
