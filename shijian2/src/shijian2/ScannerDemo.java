package shijian2;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
	System.out.println("请输入数字1~3选择菜单\n");
		do{
			System.out.println("1.新建");
			System.out.println("2.打开");
			System.out.println("3.退出");
			Scanner input = new Scanner(System.in);
			num=input.nextInt();
			switch(num){
			case 1:
				System.out.println("您选择了新建");
				break;
			case 2:
				System.out.println("您选择了打开");
				break;
			case 3:
				System.out.println("您选择了退出");
				break;
			default :
				System.out.println("无效操请您从1~3选择！");

			}
			
		}while(num!=3);
		
	}

}
