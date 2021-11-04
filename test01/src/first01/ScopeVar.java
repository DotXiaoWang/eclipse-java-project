package first01;

public class ScopeVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		if(num==2){
			int num1 = num*num;
			System.out.println("num和num1的值分别为"+num
					+"和"+num1);
			
		}
		System.out.println("num的值为："+num);
		System.out.println("    \n");
		System.out.println("王文哲"+"20210314140");
	}

}
