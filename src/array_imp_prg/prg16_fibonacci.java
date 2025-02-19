package array_imp_prg;

public class prg16_fibonacci {

	public static void main(String[] args) {
		//fibonacci series: 1,2,3,5,8,13(8+5)
         //print fibonacci series till 10 numbers
		
		int n1 =1,n2=2,sum=0;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=3;i<=10;i++)
		{
			sum =  n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
	}

}
