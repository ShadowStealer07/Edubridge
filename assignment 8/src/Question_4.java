import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.next();
		String s2=scanner.next();
		String ans=UserMainClass4.getCombo(s1,s2);
		System.out.println(ans);
	}

}
class UserMainClass4{
	public static String getCombo(String s1,String s2) {
		String ans;
		if(s1.length()>s2.length()) {
			ans=s1+s2+s1;
		}
		else {
			ans=s2+s1+s2;
		}
		return ans;
	}
}
