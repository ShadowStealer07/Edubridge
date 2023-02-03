import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// write a program to read any day number in integer and display day name in the word.
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number for day");
		int day = scanner.nextInt();
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Invalid day number");
			break;
		}

	}

}
