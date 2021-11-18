package demo01;

public class student extends teacher {
	private String name;
	private int age;
	public student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void print1(){
		System.out.println("ĞÕÃû£º"+this.name+"\t"+"ÄêÁä£º"+this.age);
		
	}
	
	

}
