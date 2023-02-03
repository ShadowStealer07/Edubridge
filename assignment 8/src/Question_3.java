import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = UserMainCode3.getMiddleChars(s);
		System.out.println(s1);
	}
}

class UserMainCode3 {
	public static String getMiddleChars(String str) {
		int index, length;
		if (str.length() % 2 == 0) {
			index = str.length() / 2 - 1;
			length = 2;
		} else {
			index = str.length() / 2;
			length = 1;
		}
		return str.substring(index, index + length);
	}
}
