package test01;
import java.util.Scanner;
public class SwitchOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch(month){
		case 1: System.out.println("һ����31��");break;
		case 2: System.out.println("������28��");break;
		case 3: System.out.println("������31��");break;
		case 4: System.out.println("������30��");break;
		case 5: System.out.println("������31��");break;
		case 6: System.out.println("������30��");break;
		case 7: System.out.println("������31��");break;
		case 8: System.out.println("������30��");break;
		case 9: System.out.println("������31��");break;
		case 10: System.out.println("ʮ����30��");break;
		case 11: System.out.println("ʮһ����31��");break;
		case 12: System.out.println("ʮ������30��");break;
		default:System.out.println("��Ч�·�");
		}
		System.out.println("������"+"20210310140");
		scanner.close();
	}

}
