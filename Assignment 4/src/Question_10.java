import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		// Write a do-while loop that asks the user to enter two numbers. The numbers
		// should be added and the sum displayed. The loop should ask the user whether
		// he or she wishes to perform the operation again. If so, the loop should
		// repeat; otherwise it should terminate.
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		boolean stop = false;
		do {
			System.out.print("Enter 1st number: ");
			num1 = scanner.nextInt();
			System.out.print("Enter 2nd number: ");
			num2 = scanner.nextInt();
			int sum = num1 + num2;
			char a = 'x';
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
			while (a == 'x') {
				System.out.println("Do you want to contiue?(Y/N):");
				a = scanner.next().charAt(0);
				if (a == 'Y' || a == 'y') {
					System.out.println("Resetting..");
					stop = false;
				} else if (a == 'n' || a == 'N') {
					System.out.println("Breaking loop...");
					stop = true;
				}else {
					System.out.println("Enter a valid input!");
					a='x';
				}
			}
		} while (stop == false);
	}

}
