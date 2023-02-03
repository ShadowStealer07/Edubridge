
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		int[] array2= {6,7,8,9,0};
		int[] array3=new int[5];
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i]+array2[i];
		}
		for(int i=0;i<array1.length;i++) {
			System.out.println(array3[i]);
		}
	}

}
