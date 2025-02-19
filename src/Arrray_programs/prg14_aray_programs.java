package Arrray_programs;

public class prg14_aray_programs {

	public static void main(String[] args) 
	{
		//sum of elements of array
		int a[] = {2,7,3};
		int sum = 0;
		for(int b:a)
		{
			sum += b;
		}
		System.out.println(sum);
		
		
		//count of elements of array....a.length also gives number of elements of array
		int c = 0;
		for(int b:a)
		{
			c++;
		}
		System.out.println(c);
		
		
		//count of even and odd elements of array
		//similarly sum of even elements and odd elements can be found separately
		int c1 = 0,c2=0;
		for(int b:a)
		{   
			if(b%2==0)
			{
			   c1++;
			}
			else
			{
				c2++;	
			}
			
		}
		System.out.println("odd: " + c2 + " even " + c1);

	}

}
