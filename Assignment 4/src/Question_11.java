import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		// Write a program to enter the numbers till the user wants and at the end it
		// should display the count of positive, negative and zeros entered
		Scanner sc = new Scanner(System.in);
		char opt;
		int num;
		int pc = 0, nc = 0, zc = 0;
		do {
			System.out.println("Enter the number");
			num = sc.nextInt();
			if (num > 0)
				pc++;
			else if (num < 0)
				nc++;
			else
				zc++;
			System.out.println("If u want to enter more type y");
			opt = sc.next().charAt(0);
		} while (opt == 'y');
		System.out.println("the count of positive numbers is " + pc);
		System.out.println("the count of negative numbers is " + nc);
		System.out.println("the count of zero numbers is "+zc);
	}

}
