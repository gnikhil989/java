package Number_theory;

import java.util.Scanner;

public class Is_Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		String res = isStrong(x);
		System.out.println(res + " is the result");

	}

	public static String isStrong(int n) {
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int lastdigit = n % 10;
			int fact = 1;
			for (int i = 1; i <= lastdigit; i++) {
				fact = fact * i;

			}
			sum = sum + fact;
			n = n / 10;

		}
		if (sum == temp) {
			return "is strong";
		} else {
			return "not a strong ";
		}

	}
}
