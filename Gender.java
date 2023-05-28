package Number_theory;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name=");
		String s = sc.nextLine();
		System.out.println("enter your age=");
		int a = sc.nextInt();
		System.out.println("enter your gender=");
		char ch = sc.next().charAt(0);
		System.out.println("name:"+ s);
		System.out.println("age :"+ a);
		System.out.println("gender :"+ ch);

	}

}
