package test01;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		//使用两个乘进行判断   先判断是不是整的  然后在判断是不是4 或者400 整除
		if(year%100==0){
			if(year%400==0){
				System.out.println(year+"是闰年");
			}else
				System.out.println(year+"不是闰年");
		}else if(year %4 ==0){
				System.out.println(year+"是闰年");
			}else{
				System.out.println(year+"不是闰年");
			}
		System.out.println("王文哲"+"20210310140");
			scanner.close();
		}
		
	}


