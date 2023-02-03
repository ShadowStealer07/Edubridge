import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard.
		int result=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to perform factorial:" );
		int i=scanner.nextInt();
		for (int j=1;j<=i;j++) {
			result=result*j;
		}
		System.out.println("Factorial is:"+result);
	}

}
