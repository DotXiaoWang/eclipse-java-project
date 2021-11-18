package shijian2;
//没有完成的代码   按照格式写的就是报错
public class YangHuiTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 8;
		int array[][] = new int [row][];
		for(int i =0;i<row;i++){
			array[i]= new int [i+1];
			array[i][0] = 1;
			array[i][i]= 1;
		}
		
		
		for(int i=2;i<row;i++){
			for(int j = 1;j<i;j++){
				array[i][j] = array[i-1][j-1]+array[i-1][j];
			}
		}
		
		
		for(int i=0;i<row;i++){
			for(int j=0;j<=i;j++){
				System.out.println(array[i][j]+" \t ");	
			}
			System.out.println();
			
		
		}
		
	}

}
