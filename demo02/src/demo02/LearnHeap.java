package demo02;
class Person{
	int age;
}

public class LearnHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Person person = new Person();
		person.age=20;
		
		chage(a,person);
		System.out.println("a="+a+"and,person.age="+person.age);

	}
	static void chage(int a1,Person person){
		a1=11;
		person.age=21;
		System.out.println("a1="+a1+",and age1="+person);
		
		
	}
	
}
