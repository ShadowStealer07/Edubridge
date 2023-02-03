import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
		int ans = UserMainCode10.countWords(s1, s2);
		System.out.println(ans);
	}

}

class UserMainCode10 {
	static int countWords(String s, String f) {
		int ans = 0;
		String words[] = s.split("\\s");
		for (String w : words) {
			if(w.equalsIgnoreCase(f)) {
				ans++;
			}
		}
		return ans;
	}
}
