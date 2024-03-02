package practice;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three nmbers:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		double average = (num1 + num2 + num3)/3;
		System.out.println("The average result of "+num1+", "+num2+" and "+num3+" is "+average);
	}

}
