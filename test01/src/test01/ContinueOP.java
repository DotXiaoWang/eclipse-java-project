package test01;

public class ContinueOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		int target = 3;
		for(int i =1;i<count;i++){
			if(i%target==0){
				System.out.println("�ҵ�Ŀ��");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("������"+"20210310140");
	}

}
