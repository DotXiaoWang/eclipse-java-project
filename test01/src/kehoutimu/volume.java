package kehoutimu;

public class volume {
	
	double chang;
	double width;
	double high;
	volume(double chang,double width,double high){
		this.chang=chang;
		this.width=width;
		this.high = high;
		System.out.println(chang* width* high);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume vo = new volume(10,20,30);
	}

}
