package chapter2_1;

public abstract  class Shape {
	double dim;
	public Shape(double dim){
		this.dim=dim;
	}
	public abstract double callArea();
	public abstract double callPerimeter();
	
}
