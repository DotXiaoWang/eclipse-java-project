package test01;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,23,6,88,19};//01234
		int index = 0;
		int max = array[index];
		for(int i = 1;i<array.length;i++){
			if(array[i]>max){
				index = i;
				max = array[i];
			}
		}
		System.out.println("���ֵ"+max+"������"+index);
		System.out.println("������"+"20210310140");
	}

}
