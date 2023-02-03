import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(UserMainCode.moveX(str));

	}
}

class UserMainCode {
	public static String moveX(String str) {
		String ans = "";
		int n = str.length();
		String ch = "";

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'x')
				ch += "x";
			else {
				ans += str.charAt(i);
			}

		}
		return ans + ch;
	}
}