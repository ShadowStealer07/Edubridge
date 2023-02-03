import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		// Write a program that prompts the user to input a positive integer.It should
		// then output a message indicating whether the number is a prime number.
		int num = -1;
		while (num < 0) {
			System.out.println("Enter a positive number: ");
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			if (num >= 0) {
				break;
			} else {
				System.out.println("Invalid input");
				num = 0;
			}
		}
		System.out.println("Breaking loop");
		int i = 2;
		if (num == 0) {
			System.out.println("Zero is neither a prime nor a composite number.");
		} else {
			boolean flag = false;
			while (i <= num / 2) {
				// condition for nonprime number
				if (num % i == 0) {
					flag = true;
					break;
				}

				++i;
			}

			if (!flag)
				System.out.println(num + " is a prime number.");

			else
				System.out.println(num + " is not a prime number.");
		}
	}

}
