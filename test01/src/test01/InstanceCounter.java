package test01;

public class InstanceCounter {
	public static int count = 0;
	public InstanceCounter(){
		count ++;
	}
	public static void printCount(){
		System.out.println("������ʵ������Ϊ��"+count);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			InstanceCounter counter = new InstanceCounter();
			
		}
		InstanceCounter.printCount();
	}

}
