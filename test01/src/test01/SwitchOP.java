package test01;
import java.util.Scanner;
public class SwitchOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年份");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
		case 1: System.out.println("一月有31天");break;
		case 2: System.out.println("二月有28天");break;
		case 3: System.out.println("三月有31天");break;
		case 4: System.out.println("四月有30天");break;
		case 5: System.out.println("五月有31天");break;
		case 6: System.out.println("六月有30天");break;
		case 7: System.out.println("七月有31天");break;
		case 8: System.out.println("八月有30天");break;
		case 9: System.out.println("九月有31天");break;
		case 10: System.out.println("十月有30天");break;
		case 11: System.out.println("十一月有31天");break;
		case 12: System.out.println("十二月有30天");break;
		default:System.out.println("无效月份");
		}
		System.out.println("王文哲"+"20210310140");
		scanner.close();
	}

}
