package test01;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������");
		Scanner scanner = new Scanner(System.in);
		int beginYear = scanner.nextInt();
		int endYear  = scanner.nextInt();
		System.out.println("��"+beginYear+"��"+endYear+"�м�Ϊ:");
		for(int year=beginYear,i=0;year<=endYear;year++,i++){
			if((year%4==0&&year %100!=0)||year %400==0){
				System.out.print(year+" ");
			}
			if(year%20==0){
				System.out.println();
			}
		}
		System.out.println("������"+"20210310140");
		scanner.close();
	}

}
