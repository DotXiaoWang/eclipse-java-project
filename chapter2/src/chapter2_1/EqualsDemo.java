package chapter2_1;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = new Integer(5);
		Integer obj2 = new Integer(10);
		Integer obj3 = new Integer(5);
		Integer obj4 = obj2;
		System.out.println("obj1.equals(obj1):"+obj1.equals(obj1));
		System.out.println("obj1.equals(obj2):"+obj2.equals(obj2));
		System.out.println("obj1.equals(obj3):"+obj3.equals(obj3));
		System.out.println("obj2.equals(obj4):"+obj2.equals(obj4));
		System.out.println("============");
		System.out.println("obj1==obj1"+(obj1==obj1));
		System.out.println("obj1==obj2"+(obj1==obj2));
		System.out.println("obj1==obj3"+(obj1==obj3));
		System.out.println("obj2==obj4"+(obj2==obj4));
		System.out.println("������+20210314140");
		

	}

}
