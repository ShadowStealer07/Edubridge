import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
		int i,j,result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		i=scanner.nextInt();
		System.out.print("Enter the power of number: ");
		j=scanner.nextInt();
		result=i;
		for(int k=1;k<j;k++) {
			result=result*i;
			System.out.println(result);
		}
		System.out.println("Answer is: "+result);

	}
}
