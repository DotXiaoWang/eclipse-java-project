package demo02;

import java.util.*;
import java.util.Arrays;
public class ArraysSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数组 然后在数组中找指定的数值找到就打印索引找不到直接返回采用二分法进行查找的
		int [] arr={1,2,3,4,5};
		System.out.println("请输入搜索的数值");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		int find = -1;
		if((find=Arrays.binarySearch(arr,key))>-1){
			System.out.println("找到值索引"+find+"位置");
			
		}
		else{
			System.out.println("找不到指定的数值");
		}
		scanner.close();
	}

}
