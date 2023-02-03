
public class Question_3 {

	public static void main(String[] args) {
		// Write a program to print lowercase letter from your name.
		String name="VaradThalkar";
		char[] arr=new char[name.length()];
		String nm="";
 		for (int i=0;i<name.length();i++) {
			arr[i]=name.charAt(i);
		}
		for (int j=0;j<name.length();j++) {
			if (arr[j]>='a' && arr[j]<='z') {
				nm+=arr[j];
			}
			else {
				
			}
		}
		System.out.println(nm);
	}

}
