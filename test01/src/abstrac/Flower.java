package abstrac;
//import java.util.ArrayList;

public class Flower {
	public String name;
	private String type;
	private String color;
	private double price;
	
	public Flower(){
		
	}
	
	public String getType() {
		return type;
	}
	
	public Flower(String name,String type,String color,double price){
		this.name = name;
		this.type = type;
		this.color = color;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}


	public static void main(String[] args) {
		Flower flower1=new Flower("玫瑰花", "路易十四", "深紫色", 400);
		Flower flower2=new Flower("玫瑰花", "朱丽叶", "淡茶色", 300);
		Flower flower3=new Flower("百合花", "地平线", "华橙色", 450);
		Flower[] f=new Flower[3];
		f[0]=flower1;
		f[1]=flower2;
		f[2]=flower3;
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getName()+'\t'+f[i].getType()+'\t'+f[i].getColor()+'\t'+f[i].getPrice());
		}
		
    }
	
	public static int add(int a,int b){
		return a+b;
	}
	
	

}
