package test01;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		//ʹ�������˽����ж�   ���ж��ǲ�������  Ȼ�����ж��ǲ���4 ����400 ����
		if(year%100==0){
			if(year%400==0){
				System.out.println(year+"������");
			}else
				System.out.println(year+"��������");
		}else if(year %4 ==0){
				System.out.println(year+"������");
			}else{
				System.out.println(year+"��������");
			}
		System.out.println("������"+"20210310140");
			scanner.close();
		}
		
	}


