package test01;
import java.util.Scanner;//需要导入的包 包中含有的函数定义
public class Retcangle {
	private double width;
	private double length;
	public Retcangle(double width,double length){
		this.length=length;
		this.width=width;
	}
	public Retcangle(){
		
	}
	
	
	public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width=width;
		
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public void getLength(double length){
		this.length=length;
	}
	public void output(){
		System.out.println("长方形长为："+length);
		System.out.println("长方形宽为："+width);
		System.out.println("长方的面积为："+area());
		System.out.println("长方形的周长："+perimeter());
	}
	public double area(){
		return width*length;
	}
	public double perimeter(){
		return 2*(width+length);
	}
	//this关键字获取当前对象的应用   构造方法可以带有参数也可以不带参数   封装在内部使用内部机制进行调试和使用
	public static void main(String[] argv){
		
//		retcangle.setLength(10);
//		System.out.println(retcangle.getLength());
//		retcangle.output();
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		double length = scanner.nextDouble();
		System.out.println("请输入长方形的宽：");
		double width = scanner.nextDouble();
		
		Retcangle retcangle= new  Retcangle(length,width);
		retcangle.output();
		scanner.close();
		
		
		
	}
}
