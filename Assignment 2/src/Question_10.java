import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		// 10.	write a program to display your name in short like yourname.fathernamefirstletter.sirnamefirstletter
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter your Name:");
		String name=scanner.next();
		System.out.println("");
		System.out.print("Enter your Fathers name:");
		char father= scanner.next().charAt(0);
		System.out.println("");
		System.out.print("Enter your Surname:");
		char surname=scanner.next().charAt(0);
		System.out.println();
		System.out.println("Your name is: "+name+"."+father+"."+surname);
		
	}

}
