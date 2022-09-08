package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("the first integer?");
		int n1 = scan.nextInt();
		System.out.println("the second integer?");
		int n2 = scan.nextInt();
		double average = (n1 + n2) / 2.0;
		System.out.println("The average is " + average + ".");
		
	}

}
