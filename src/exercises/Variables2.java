package exercises;

public class Variables2 {

	public static void main(String[] args) {
		
		double num1 = Math.random()*4;
		double num2 = Math.random()*4;
		System.out.println(num1);
		System.out.println(num2);
		double result = num1/num2;
		
		System.out.println("The result is: "+ String.format("%.2f", result));
		System.out.format("The result is %.2f", result);
		

	}

}
