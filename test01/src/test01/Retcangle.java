package test01;
import java.util.Scanner;//��Ҫ����İ� ���к��еĺ�������
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
		System.out.println("�����γ�Ϊ��"+length);
		System.out.println("�����ο�Ϊ��"+width);
		System.out.println("���������Ϊ��"+area());
		System.out.println("�����ε��ܳ���"+perimeter());
	}
	public double area(){
		return width*length;
	}
	public double perimeter(){
		return 2*(width+length);
	}
	//this�ؼ��ֻ�ȡ��ǰ�����Ӧ��   ���췽�����Դ��в���Ҳ���Բ�������   ��װ���ڲ�ʹ���ڲ����ƽ��е��Ժ�ʹ��
	public static void main(String[] argv){
		
//		retcangle.setLength(10);
//		System.out.println(retcangle.getLength());
//		retcangle.output();
		
		Scanner  scanner = new Scanner(System.in);
		System.out.println("�����볤���εĳ���");
		double length = scanner.nextDouble();
		System.out.println("�����볤���εĿ�");
		double width = scanner.nextDouble();
		
		Retcangle retcangle= new  Retcangle(length,width);
		retcangle.output();
		scanner.close();
		
		
		
	}
}
