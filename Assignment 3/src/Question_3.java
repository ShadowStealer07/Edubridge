import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// program to read temperature in centigrade and display appropriate message
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the temprature");
		int temp=scanner.nextInt();
		if (temp<0) {
			System.out.println("Freezing weather");
		}
		else if(temp>0 && temp<=10){
			System.out.println("Very cold weather");
		}
		else if (temp>10 && temp<=20) {
			System.out.println("Cold Weather");
		}
		else if (temp>20 && temp<=30) {
			System.out.println("Normal in Temp");
		}
		else if (temp>30 && temp<40) {
			System.out.println("Its Hot");
		}
		else {
			System.out.println("Very Hot");
		}
	}

}
