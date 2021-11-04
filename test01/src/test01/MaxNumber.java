package test01;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner  scanner =new  Scanner(System.in);
		System.out.println("请输出三个整数");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int maxNum = 0;
		int minNum = 0;
		//判断最大和最小数值
		if(num1>num2){
			maxNum = num1;
			minNum = num2;
			
		}else{
			maxNum = num2;
			minNum = num1;
			
		}
		if(maxNum<num3){
			maxNum=num3;
		}else{
			minNum = num3;
		}
		System.out.println("最大值:"+maxNum+"最小值："+minNum);
		//判断偶数和奇数    实现两个判断
		if(maxNum %2 ==0){
			System.out.println("最大值为偶数");
		}else{
			System.out.println("最大值为奇数");
		}
		if(minNum %2 ==0){
			System.out.println("最小值为偶数");
		}else{
			System.out.println("最小值为奇数");
		}
		System.out.println("王文哲"+"20210310140");
		scanner.close();
		
		
	}

}
