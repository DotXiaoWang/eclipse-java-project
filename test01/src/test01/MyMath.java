package test01;
 

public class MyMath {
	public int add(int a,int b){
		return a+b;
	}
	public float add(float a,float b){
		return a + b;
	}
	public double add(double a,double b){
		return a + b;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m = new MyMath();
		System.out.println("3+5="+m.add(3,5));
		System.out.println("3.1415926+5.0="+m.add(3.1415926F,5.0F));  //数据类型不一样
		System.out.println("3.1415926+5.0="+m.add(3.1415926,5.0));
		System.out.println("王文哲"+"20210314140");

		
		
	}

}
