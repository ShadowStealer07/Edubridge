import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String ans=UserMainClass8.getFormatedString(s1);
	    System.out.println(ans);
	}

}

class UserMainClass8{
  public static String getFormatedString(String s1) {
    StringBuffer sb = new StringBuffer();
    StringTokenizer st = new StringTokenizer(s1, " ");
    String s2 = st.nextToken();
    String s3 = st.nextToken();
    String s4 = st.nextToken();
    sb.append(s4).append(" ");
    sb.append(s3.substring(0, 1));
    sb.append(".");
    sb.append(s2.substring(0, 1));
	return sb.toString();
  }
}