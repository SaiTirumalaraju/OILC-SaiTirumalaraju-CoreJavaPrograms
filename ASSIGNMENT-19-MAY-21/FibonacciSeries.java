import java.util.*;
public class FibonacciSeries {

	static int getNthTermOfFibonacciSeries(int position) {
		int result;
		String fib = "";
		int a = 0, b = 1, c = a + b;
		
		if(position == 1) {
			result = a;
			fib += a;
		}
		else {
			result = b;
			fib += a + " ";
			fib += b + " ";
		}
			
		for(int i = 3;i <= position;i++) {
			c = a + b;
			fib += c + " ";
			a = b;
			b = c;
			result = c;
		}
		System.out.println("Fibonacci series  \n" + fib);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		System.out.println("Nth term : " + getNthTermOfFibonacciSeries(sc.nextInt()));
	}

}
