package test01;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner  scanner =new  Scanner(System.in);
		System.out.println("�������������");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int maxNum = 0;
		int minNum = 0;
		//�ж�������С��ֵ
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
		System.out.println("���ֵ:"+maxNum+"��Сֵ��"+minNum);
		//�ж�ż��������    ʵ�������ж�
		if(maxNum %2 ==0){
			System.out.println("���ֵΪż��");
		}else{
			System.out.println("���ֵΪ����");
		}
		if(minNum %2 ==0){
			System.out.println("��СֵΪż��");
		}else{
			System.out.println("��СֵΪ����");
		}
		System.out.println("������"+"20210310140");
		scanner.close();
		
		
	}

}
