package shijian2;
//这个案例没有出现错误
public class CalculateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		double sum = 0;
		for(double i=1;i<=100;i++){
			if(i %2==0){
				sum = sum-(1/i);
			}else{
				sum = sum+(1/i);
			}
		}
		System.out.println("sum+"+sum);
	}

}
