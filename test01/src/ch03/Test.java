package ch03;
import ch03.MyClass1;
public class Test {
	public void func(){
		MyClass1 obj1 = new MyClass1();// �������󿪱��ڴ�
		System.out.println(obj1.a);//���������κεط����ܷ���
		//System.out.println(obj1.b);  //����˽�е�û�а취���з���
		System.out.println(obj1.c);//c�ܱ���������   ͬ�����п��Է��� 
		System.out.println(obj1.d);//Ϊȱʡ��  ͬ�����п��Է���  
		obj1.func1();//   ��������  �κεط����ǿ��Է��ʵ� 
		obj1.func2();//   �ܱ����ķ���  ���в��ܽ��з���  ��Ҫʹ��set��get����
		obj1.func3();// �ܱ����ķ���   ͬ���е�����Է���  �������е�������Է���
		obj1.func4();//   ͨ���е�ȱʡ����Է���  
		MyClass2 obj2 = new MyClass2();
		obj2.func1();

	}

}