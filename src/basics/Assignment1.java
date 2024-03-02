package basics;

public class Assignment1 {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		
		System.out.println(sumNumbers(4));
		
	}
	
	static int sumNumbers (int number) {
		int sum =0;
		for (int i = number; i >= 1; i--) {
			sum = sum + i;
		}
		return sum;
	}

}
