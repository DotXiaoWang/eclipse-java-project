package shijian2;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//û������ǰ
		int a[] = {2,12,3,5,98,-12,8,28,69,110,0,-1};
		System.out.println("����ǰ������");
		for(int i = 0;i<a.length;i++){
			System.out.println(a[i]+"");
		}
		System.out.println();
		//���������
		for(int i =1;i<a.length;i++){
			for(int j = 0;j<=a.length-i-1;j++){
				int temp = a[j];
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("����������");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}

}
