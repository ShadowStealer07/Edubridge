import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// write a program that prompths the user to input a positive integer. it should then print the multiplication table of that number.
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int i=scanner.nextInt();
		for (int j=1;j<=10;j++) {
			System.out.println(i*j);
		}

	}

}
