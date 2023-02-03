import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int pos=scanner.nextInt();
		int len=scanner.nextInt();
		UserMainCode2 ums=new UserMainCode2();
		String ans =ums.reverseSubstring(s, pos, len);
		System.out.println(ans);
	}
}
class UserMainCode2{
	public String reverseSubstring(String s,int pos,int len) {//rajasthan
		StringBuilder input1 = new StringBuilder();
		  
        // append a string into StringBuilder input1
        input1.append(s);
  
        // reverse StringBuilder input1
        input1.reverse();//nahtsajar
		String ans=input1.substring(pos, pos+len);
		return ans;
	}
}
