package array_imp_prg;

public class prg9_smallest_largest {

	public static void main(String[] args)
	{
		//find largest number
//		int a[] = {2,4,6,1};
//		int max = 0;
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]>max)
//			{
//				max = a[i];
//			}
//		}
//		System.out.println("largest element is " + max);
//		
//		
//		//find smallest element
//		int min = a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(a[i]<min)
//			{
//				min = a[i];
//			}
//		}
//		System.out.println("smallest element is " + min);
		
		
		//find 3rd largest
		int a[] = {2,3,7,1,5,4};
		int max = 0,max2=0,max3=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max3=max2;
				max2=max;
				max = a[i];
			}
			else if(a[i]>max2)
			{
				max3=max2;
				max2=a[i];
			}
			else if(a[i]>max3)
			{
				max3 = a[i];
			}
		}
		System.out.println(max +" " + max2 + " " + max3);
		
		
		
		
	}

}
