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
		System.out.println("��chage������  obj.a="+obj.a+"��obj.b"+obj.b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ΪֻҪ�Ǹ�ֵ��ֵ�ͻ�ı�   
		CallByRef obj = new CallByRef(15,20);
		System.out.println("����֮ǰ  obj.a="+obj.a+"��obj.b"+obj.b);
		obj.chage(obj);
		System.out.println("����֮�� obj.a="+obj.a+"��obj.b"+obj.b);
		System.out.println("������"+"20210314140");
	}

}
