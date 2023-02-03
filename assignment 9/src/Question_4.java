import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// write a program to count the number of vowels and consonents in the given message.
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message = sc.nextLine();
        sc.close();

        int vowelCount = 0, consonantCount = 0;
        message = message.toLowerCase(); 
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' ||  c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') { 
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);	
	}

}
