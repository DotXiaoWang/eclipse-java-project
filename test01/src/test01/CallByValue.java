package test01;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println("����chage����ǰ"+num);
		CallByValue  callByvalue = new CallByValue();
		callByvalue.chage(num);
		System.out.println("����chage������"+num);
		System.out.println("������"+"20210314140");
	
		
		
	}
	public void chage(int num){
		num +=5;
		System.out.println("change������numֵΪ��"+num);
	}
}