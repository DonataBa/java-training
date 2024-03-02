package basics;

public class Factorials {

	public static void main(String[] args) {
		// Write a function that computes the factorial value
System.out.println(fact(5));
	}
	
	static int fact(int number) {
		int result = 1;
		if (number == 0) {
			result = 1;
		}
		for (int i = number; i > 1; i--) {
			result = result * i;
			System.out.println("Intermediate result: "+result);
		}
		return result;
	}

}
