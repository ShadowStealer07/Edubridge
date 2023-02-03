import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter four numbers");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 int num3=sc.nextInt();
		 int num4=sc.nextInt();
		 
		 // && operator(Logical AND prints true only if both expression1 and expression2 are true
		 System.out.println("logical AND operation");
		 System.out.println((num1 > num2) && (num3 > num4)); 
		 System.out.println((num1> num2) && (num3 < num4)); 
		 // || (Logical OR) operator prints true if either expression1 or expression2 is true
		 System.out.println("logical OR operation");
		 System.out.println((num1< num2) || (num3 > num4)); 
		 System.out.println((num1 > num2) || (num3 < num4)); 
		 System.out.println((num1 < num2) || (num3 < num4)); 
		 // !(Logical NOT) operator prints true if expression is false and vice versa
		 System.out.println("logical NOT operation");
		 System.out.println(!(num1== num2)); 
		 System.out.println(!(num1<num2)); 
		 System.out.println(!(num2>=num4)); 
		 System.out.println(!(num4<= num3)); 

	}

}
