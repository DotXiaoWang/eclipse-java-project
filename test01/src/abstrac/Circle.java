package abstrac;

public class Circle extends Shape {
	public Circle(double dim){
		super(dim);
	}

	@Override
	public double callArea() {
		// TODO Auto-generated method stub
		return 3.14*dim*dim;
	}

	@Override
	public double callPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*dim;
	}
	public static void main(String[] args){
		Shape shape = new Circle(10);
		System.out.println("Բ������ǣ�"+shape.callArea());
		System.out.println("Բ���ܳ��ǣ�"+shape.callPerimeter());
		
	}
	
}
