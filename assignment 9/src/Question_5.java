import java.util.HashMap;
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println(UserMainCode.countRepeaters(arr, size));
	}
}

class UserMainCode {
	public static int countRepeaters(int[] arr, int size) {

		if (size <= 0 || arr == null) {
			System.out.println("Invalid Input");
			return -1;
		}
		for (int i = 0; i < size; i++) {
			if (arr[i] < 0) {
				System.out.println("Invalid Input");
				return -1;
			}
		}

		HashMap<Integer, Integer> salaryCount = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (salaryCount.containsKey(arr[i])) {
				salaryCount.put(arr[i], salaryCount.get(arr[i]) + 1);
			} else {
				salaryCount.put(arr[i], 1);
			}
		}

		int repeaters = 0;
		for (int count : salaryCount.values()) {
			if (count > 1) {
				repeaters++;
			}
		}

		return repeaters;
	}

}