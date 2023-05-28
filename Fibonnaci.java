package Number_theory;

import java.util.Scanner;

public class Fibonnaci {

	public class Fibonacci {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int res = fibonacci(n);
			System.out.println(res + ": is the result");

		}

		public static int fibonacci(int n) {
			int x = 0;
			int y = 1;
			int swap = 0;

			while (swap <= n) {
				x = y;
				y = swap;
				swap = x + y;
				System.out.println(swap);
			}

			return swap;

		}
	}
}
