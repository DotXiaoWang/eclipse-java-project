package test01;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println("调用chage方法前"+num);
		CallByValue  callByvalue = new CallByValue();
		callByvalue.chage(num);
		System.out.println("调用chage方法后"+num);
		System.out.println("王文哲"+"20210314140");
	
		
		
	}
	public void chage(int num){
		num +=5;
		System.out.println("change方法中num值为："+num);
	}
}
