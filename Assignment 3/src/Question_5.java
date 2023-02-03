import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// write a program to accept a grade and declare the equivalent description
		System.out.println("Enter a grade from (E,V,G,A,F):");
		Scanner scanner= new Scanner(System.in);
		char grade=scanner.next().charAt(0);
		switch (grade) {
		case 'E':
			System.out.println("Excellent");
			break;
		case 'V':
			System.out.println("Very Good");
			break;
		case 'G':
			System.out.println("Good");
			break;
		case 'A':
			System.out.println("Average");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		default:
			System.out.println("Invalid Grade");
		}
		

	}

}
