import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// Write a program to calculate HCF of two given number.
		int a, b, i, hcf = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();

		for (i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println("HCF of given two numbers is: " + hcf);

	}

}
