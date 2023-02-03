import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode1 umc=new UserMainCode1();
		String out=umc.formString();
		System.out.println(out);
	}

}
class UserMainCode1{
	String formString() {
		Scanner scanner=new Scanner(System.in);
		int len=scanner.nextInt();
		String[] array=new String[len];
		for(int j=0;j<len;j++) {
			array[j]=scanner.next();
		}
		int num=scanner.nextInt()-1;
		String ans="";
		for(int i=0;i<len;i++) {
			if (array[i].length()>num) {
				ans=ans+array[i].charAt(num);
			}
			else {
				ans=ans+"$";
			}
		}
		return ans;
	}
}
