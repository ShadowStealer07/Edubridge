import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		if (size < 0) {
			System.out.println("Invalid array size");
		} else {
			int[] num = new int[size];
			for (int i = 0; i < size; i++) {
				num[i] = scanner.nextInt();
			}
			System.out.println(UserMainCode1.maximumSum(num, size));
		}
	}

}

class UserMainCode1 {
	static int maximumSum(int numbers[], int size) {
		if (size < 0) {
			System.out.println("Invalid array size");
			return 0;
		}
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < size; i++) {
			if (numbers[i] < 0) {
				System.out.println("Invalid input");
				return 0;
			}
			if (numbers[i] % 2 == 0) {
				evenSum += numbers[i];
			} else {
				oddSum += numbers[i];
			}
		}
		return Math.max(evenSum, oddSum);
	}
}