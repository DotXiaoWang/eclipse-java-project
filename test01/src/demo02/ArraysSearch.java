package demo02;

import java.util.*;
import java.util.Arrays;
public class ArraysSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� Ȼ������������ָ������ֵ�ҵ��ʹ�ӡ�����Ҳ���ֱ�ӷ��ز��ö��ַ����в��ҵ�
		int [] arr={1,2,3,4,5};
		System.out.println("��������������ֵ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		int find = -1;
		if((find=Arrays.binarySearch(arr,key))>-1){
			System.out.println("�ҵ�ֵ����"+find+"λ��");
			
		}
		else{
			System.out.println("�Ҳ���ָ������ֵ");
		}
		scanner.close();
	}

}
