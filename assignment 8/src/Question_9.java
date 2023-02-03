import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    String ans=UserMainClass9.printCapitalized(s1);
	    System.out.println(ans);
	}

}
class UserMainClass9{
	static String printCapitalized(String s) {
		String words[]=s.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
		return capitalizeWord;
	}
}