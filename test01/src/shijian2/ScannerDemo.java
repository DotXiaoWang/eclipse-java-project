package shijian2;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
	System.out.println("����������1~3ѡ��˵�\n");
		do{
			System.out.println("1.�½�");
			System.out.println("2.��");
			System.out.println("3.�˳�");
			Scanner input = new Scanner(System.in);
			num=input.nextInt();
			switch(num){
			case 1:
				System.out.println("��ѡ�����½�");
				break;
			case 2:
				System.out.println("��ѡ���˴�");
				break;
			case 3:
				System.out.println("��ѡ�����˳�");
				break;
			default :
				System.out.println("��Ч��������1~3ѡ��");

			}
			
		}while(num!=3);
		
	}

}
