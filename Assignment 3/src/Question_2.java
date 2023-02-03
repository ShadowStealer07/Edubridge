import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		//program to read roll no, name and marks of the three subjects and calculate the total,percentage and division
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input the roll no of student:");
		int rollNo= scanner.nextInt();
		System.out.print("Input the name of student: ");
		String name= scanner.next();
		System.out.print("Input the marks of Physics, Chemistry and Computer Application :");
		int sub1=scanner.nextInt();
		int sub2=scanner.nextInt();
		int sub3=scanner.nextInt();
		
		System.out.println("Roll No:"+rollNo);
		System.out.println("Name of Student: "+name);
		System.out.println("Marks of Physics: "+sub1);
		System.out.println("Marks of Chemistry: "+sub2);
		System.out.println("Marks of Computer Application: "+sub3);
		System.out.println("Total Marks: "+(sub1+sub2+sub3));
		float percentage=((sub1+sub2+sub3)*100)/300;
		System.out.println("Percentage: "+percentage);
		String division;
		if(percentage<=35) {
			division="Failed";
			System.out.println("Division"+division);
		}
		else if(percentage>35 && percentage<=50) {
			division="Third";
			System.out.println("Division: "+division);
		}
		else if(percentage>50 && percentage<=75) {
			division="Second";
			System.out.println("Division: "+division);
		}
		else if(percentage>75) {
			division="First";
			System.out.println("Division: "+division);
		}
		else {
			System.out.print("Something went wrong in percentage");
		}
	}
}
