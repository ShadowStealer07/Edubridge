import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter your number to check whether it is greater than 100 and 200:");
		int num = sc.nextInt();
		System.out.println("If entered number is greater than 100 and 200 it will say true else it will say false..");
		System.out.println(num>100 && num>200);
	}

}
