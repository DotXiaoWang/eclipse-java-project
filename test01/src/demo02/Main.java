package demo02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到java的世界！！！");
        for (int i = 1; i <= 5; i++) {//打印上半部分空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//打印上半部分*
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
