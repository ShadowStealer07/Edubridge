import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// write a program using arthmetic operators.
		Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter two numbers");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 // The binary Arithmetic operators are + - * / %
		 System.out.println("The addition of two integers is:" + (num1 + num2));
		 float result = num1 - num2;
		 float result2 = num1 / num2;
		 System.out.println("The subraction of two numbers is:" + result);
		 System.out.println("The multiplication of two numbers is:" + (num1 * 
		num2));
		 System.out.println("The division of two numbers is:" + result2);
		 System.out.println("The remainer when the first number is divided by second number:" + (num1 % num2));
		 
		 // Unary operators are which operates on single operand + -
		 System.out.println("The -(minus) opertor will negates the result:" + -result);
		 char ch = 'A';
		 System.out.println("The + operator will promotes the output to int if it is byte or char or short:" + +ch);
		 // ++ --(increment,decrement)
		 System.out.println("prints and then increments:" + num1++);// post increment
		 System.out.println("first increments and then prints:" + ++num1);// pre increment
		 System.out.println("first prints and then decrements:" + num2--);// post decrement
		 System.out.println("first decrements and then prints" + --num2);// pre decrement
		
	}

}
