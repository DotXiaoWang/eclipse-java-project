package demo02;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组使用sort进行排序   使用sort进行排序的操作
		int [] arr ={93,5,3,55,57};
		Arrays.sort(arr);
		System.out.println("排序后");
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]+",");
			
		}
		
		
		
	}

}
