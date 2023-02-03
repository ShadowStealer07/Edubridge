import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter two numbers to check whether it is same or not:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("If the entered numbers are same it will say true else it will say false");
		System.out.println(num1==num2);
	}

}
