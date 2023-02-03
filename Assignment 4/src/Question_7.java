import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// write a program that reads a set of integers, and then prints the sum of the even and odd integers
		int even=0,odd=0;
		System.out.println("Enter size of the set: ");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] set=new int[size];
		System.out.print("Enter the set of integers: ");
		for(int i=0;i<size;i++) {
			set[i]=scanner.nextInt();
		}
		for(int j=0;j<size;j++) {
			if(set[j]%2==0) {
				even=even+set[j];
			}
			else {
				odd=odd+set[j];
			}
		}
		System.out.println("sum of odd numbers is: "+odd);
		System.out.println("sum of even numbers is: "+even);
	}

}
