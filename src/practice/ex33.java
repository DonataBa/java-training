package practice;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		
		
		int sum = 0;
		while (number > 1) {
			sum = sum + number%10;
			System.out.println(sum);
			number = number/10;
			System.out.println(number);
		}
		sum = sum+number;
		System.out.println("The sum is "+sum);
	}

}
