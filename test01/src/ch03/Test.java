package ch03;
import ch03.MyClass1;
public class Test {
	public void func(){
		MyClass1 obj1 = new MyClass1();// 创建对象开辟内存
		System.out.println(obj1.a);//公共属性任何地方都能访问
		//System.out.println(obj1.b);  //类中私有的没有办法进行访问
		System.out.println(obj1.c);//c受保护的属性   同包类中可以访问 
		System.out.println(obj1.d);//为缺省的  同包类中可以访问  
		obj1.func1();//   公共访问  任何地方都是可以访问的 
		obj1.func2();//   受保护的方法  类中不能进行访问  需要使用set和get访问
		obj1.func3();// 受保护的方法   同包中的类可以访问  其他包中的子类可以访问
		obj1.func4();//   通包中的缺省类可以访问  
		MyClass2 obj2 = new MyClass2();
		obj2.func1();

	}

}
