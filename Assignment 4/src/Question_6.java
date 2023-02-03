import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. for example,if the input is 12345,the output should be 54321.
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to be reversed:");
		int number=scanner.nextInt();
		while(number>0) {
			int reminder=number%10;
			System.out.print(reminder);
			number=number/10;
		}
	}
}
