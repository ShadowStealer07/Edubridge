
public class Question_2 {

	public static void main(String[] args) {
		// addition of odd and even numbers this code is correct right?
		int[] arr= {10,1,2,3,4,5,6,7,8,9};
		int even=0;
		int odd=0;
		for (int i=0;i<10;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
