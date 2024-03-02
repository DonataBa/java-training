package basics;

public class FibonnachiNumbers {

	public static void main(String[] args) {
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 1 + 0 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		
		int[] fib = new int[20];
		fib[0]=0;
		fib[1]=1;
		
		System.out.println(fib[0]);
		System.out.println(fib[1]);
		for(int i = 2; i < 20; i++) {			
			fib[i] = fib[i-2] + fib[i-1];
			System.out.println(fib[i]);
		}
		}


}
