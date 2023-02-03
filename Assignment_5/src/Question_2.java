import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+=b);//this operation performs a=a+b
		System.out.println(a-=b);//this operation performs a=a-b
		System.out.println(a*=b);//this operation performs a=a*b
		System.out.println("Please enter two numbers");
		int a1 = sc.nextInt();
		int b1= sc.nextInt();
		System.out.println(a1/=b1);//this operation performs a1=a1/b1
		 
		System.out.println(a1%=b1); //this operation performs a1=a1%b1 the value of b1 to a1
		System.out.println(a1=b1);//this assigns the value of b1 to a1 
	}

}
