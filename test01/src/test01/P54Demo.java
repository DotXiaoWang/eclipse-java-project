package test01;

public class P54Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("打印1-10的和其中的偶数");
		int sum=0;
		for(int i=1;i<=10;i++){
			sum = sum+i;
			i++;
			if(i%2==0){
				System.out.print(i+",");
			}

			
		}
		System.out.println("总数"+sum);
		System.out.println("王文哲"+"20210310140");
		
		

	}

}
