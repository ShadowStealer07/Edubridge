import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		String ans=UserMainClass6.getSpecialChar(s);
		System.out.print(ans);
	}
	
}
class UserMainClass6{
	static String getSpecialChar(String str) {
		char[] s = str.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            // Store only valid characters
            if ((s[i] >= 'A' && s[i] <= 'Z')
                    || (s[i] >= 'a' && s[i] <= 'z')) {
                
            }
            else {
            	s[j] = s[i];
                j++;
            }
        }
		return String.valueOf(s).substring(0, j);
	}
}
