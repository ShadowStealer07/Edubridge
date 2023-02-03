import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The relational operators are == > < <= >= != 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter two numbers");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 System.out.println("The relational operators checks the given condition and returns boolean value i.e, true or false");
		 System.out.println(num1==num2);//if num1 is equal to num2 ,returns true else false
		 System.out.println(num1>num2);//if num1 is greater than num2 ,returns true else false
		 System.out.println(num1<num2);//if num1 is smaller than num2 ,returns true else false
		 System.out.println(num1>=num2);//if num1 is greater than or equal to num2 ,returns true else false
		 System.out.println(num1<=num2);//if num1 is smaller than or equal to num2 ,returns true else false
		 System.out.println(num1!=num2);//if num1 is not equal to num2 ,returns true else false
	}

}
