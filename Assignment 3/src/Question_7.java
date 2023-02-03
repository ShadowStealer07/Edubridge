import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// Read integer value and display the number of days for this month
		System.out.println("Enter the number of month: ");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		switch (month) {
		case 2:
			System.out.println("28 Days");
			break;
		case 1,3,5,7,8,10,12:
			System.out.println("31 Days");
			break;
		case 4,6,9,11:
			System.out.println("30 Days");
			break;	
		default:
			System.out.println("Invalid input!");
		}

	}

}
