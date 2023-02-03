import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String ans=UserMainClass7.negativeString(s);
		System.out.println(ans);
	}

}
class UserMainClass7{
	static String negativeString(String s) {
		String newstring = "";
		  int l = s.length();
		  for(int i = 0; i < l; i++)
		  {
		    if(i-1 >= 0 && Character.isLetter(s.charAt(i-1))|| i+2 < l && Character.isLetter(s.charAt(i+2))) 
			{
		      newstring += s.charAt(i);
		      continue;
		    }
		    else if(i+1 < l && s.substring(i, i+2).equals("is")) 
			{
		      newstring += "is not";
		      i++;
		    }
		    else newstring += s.charAt(i);
		  }
		  return newstring;
	}
}