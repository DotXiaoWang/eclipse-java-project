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
		System.out.println("Բ������ǣ�"+shape.callArea());
		System.out.println("Բ���ܳ��ǣ�"+shape.callPerimeter());
		System.out.println("������+20210314140");
	}
	
	
	

}