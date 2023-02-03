import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		String s2 = validString(s, n);
		System.out.println(s2);
	}

	public static String validString(String s, int n) {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}

		return sb.toString();

	}
}