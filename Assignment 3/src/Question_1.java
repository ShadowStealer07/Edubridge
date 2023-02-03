import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		//Write a program to find if the year is leap year or not
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the year:");
		int year=scanner.nextInt();
		if (year%4==0) {
			System.out.println(year+" is leap year");
		}
		else{
			System.out.println(year+" is not a leap year");
		}
	}

}
