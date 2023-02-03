import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter your number to check whether it is even or odd:");
		int num = sc.nextInt();
		System.out.println("If a entered number is even it will print true ,it if is odd it will print false");
		System.out.println(num%2==0);
		 
	}

}
