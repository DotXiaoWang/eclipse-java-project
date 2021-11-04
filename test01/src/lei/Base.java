package lei;
/**
 * 主类和父类之间也是有前后执行的顺序  不然会出现错误
 * */
class Son extends Base{
	int b;
	public Son(){
		b=100;
		System.out.println("In Son constructor");
	}
	public void print(){
		System.out.println("a:"+a+",b:"+b);
	}
}



public class Base {
	protected int a;
	public Base(){
		a=20;
		System.out.println("In Base constructor");
		
	}


	public static void main(String[] args){
		Son obj = new Son();
		obj.print();
	}

}




