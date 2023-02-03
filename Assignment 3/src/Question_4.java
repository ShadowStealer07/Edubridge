import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// program to check whether a character is an alphabet, digit or special character 
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter a character");
		char c =scanner.next().charAt(0);
		switch (c) {
		case '1','2','3','4','5','6','7','8','9','0':
			System.out.println("Character is number");
			break;
		case '!','@','#','$','%','^','&','*','(',')','-','+','/':
			System.out.println("Character is Special");
			break;
		default:
			System.out.println("Character is string");
			break;
		}
	}

}
