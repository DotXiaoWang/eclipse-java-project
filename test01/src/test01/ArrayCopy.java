package test01;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,2,3,4,5};
		int [] array2 = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		for(int i = 0;i<array2.length;i++){
			System.out.print(array2[i]+",");
		}
		System.out.println("ÍõÎÄÕÜ"+"20210310140");
	}

}
