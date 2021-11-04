package test01;

public class Array2DDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int[2][2];
		for(int i =0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=j+2*i+1;
				
			}
			
		}
		for(int i =0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.println("array["+i+"]["+j+"]="+array[i][j]);
				
			}

		}
		System.out.println("ÍõÎÄÕÜ"+"20210310140");
		
		
	}

}
