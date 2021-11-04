package test01;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//打印十六进制的散列地址   并不是实际的地址   该方法不能证明这个对象是一个相同的对象
		String s1 = "hello";
		String s2 = new String("hello");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
	}

}
