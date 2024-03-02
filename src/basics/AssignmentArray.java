package basics;

public class AssignmentArray {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array

		int[] numbers = {4, 4, 16, 0, 3};
		System.out.println("Minimum number in array is: "+minimum(numbers));
		System.out.println("Maximum number in array is: "+maximum(numbers));
		System.out.println("Average of array numbers is: "+average(numbers));
	}
	
	static int minimum(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	static int maximum(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	static int average(int[] array) {
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			sum = sum + array[i];		
		}
		System.out.println(sum);
		return sum/array.length;
	}

}
