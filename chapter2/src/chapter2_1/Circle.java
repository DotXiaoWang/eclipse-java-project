package chapter2_1;

public class Circle  extends Shape  {
	public Circle (double dim) {
		super(dim);
		
		
	}
	public double callArea(){
		return 3.14*dim*dim;
		
	}
	public double callPerimeter(){
		return 2*3.14*dim;
		
		
	}
	public static void main(String[] args){	
		Shape shape = new Circle(10);
		System.out.println("圆的面积是："+shape.callArea());
		System.out.println("圆的周长是："+shape.callPerimeter());
		System.out.println("王文哲+20210314140");
	}
	
	
	

}
