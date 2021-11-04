package first01;

public class Person {
	private String name;
	private int age;
	private String gender;
	public Person(){
		System.out.println("无参数的构造方法");
	}
	public Person(String name,int age,String gender){
		System.out.println("有参数的构造方法");
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	

}
