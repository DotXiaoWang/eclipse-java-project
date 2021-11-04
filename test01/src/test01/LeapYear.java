package test01;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份");
		Scanner scanner = new Scanner(System.in);
		int beginYear = scanner.nextInt();
		int endYear  = scanner.nextInt();
		System.out.println("从"+beginYear+"到"+endYear+"中间为:");
		for(int year=beginYear,i=0;year<=endYear;year++,i++){
			if((year%4==0&&year %100!=0)||year %400==0){
				System.out.print(year+" ");
			}
			if(year%20==0){
				System.out.println();
			}
		}
		System.out.println("王文哲"+"20210310140");
		scanner.close();
	}

}
