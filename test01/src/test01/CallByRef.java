package test01;

public class CallByRef {
	int a,b;
	CallByRef(int i,int j){
		a=i;
		b=j;
	}
	void chage(CallByRef obj){
		obj.a=50;
		obj.b=40;
		System.out.println("在chage方法中  obj.a="+obj.a+"，obj.b"+obj.b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//最终理解为只要是赋值数值就会改变   
		CallByRef obj = new CallByRef(15,20);
		System.out.println("调用之前  obj.a="+obj.a+"，obj.b"+obj.b);
		obj.chage(obj);
		System.out.println("调用之后 obj.a="+obj.a+"，obj.b"+obj.b);
		System.out.println("王文哲"+"20210314140");
	}

}
