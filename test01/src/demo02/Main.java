package demo02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭ����java�����磡����");
        for (int i = 1; i <= 5; i++) {//��ӡ�ϰ벿�ֿո�
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//��ӡ�ϰ벿��*
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


	}

}
