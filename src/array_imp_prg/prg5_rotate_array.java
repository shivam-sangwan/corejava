package array_imp_prg;

import java.util.Arrays;

public class prg5_rotate_array {

	public static void main(String[] args) {
		//rotate an array to right by 1 element...right shift
//		int a[] = {1,2,3,4,5};  //result should: {5,1,2,3,4}
//		int last = a[a.length-1];
//		
//		for(int i=(a.length-1);i>0;i--)
//		{
//			a[i]= a[i-1];
//		}
//		a[0] = last;
//		System.out.println(Arrays.toString(a));
		
		//rotate an array to right by 3 elements
		int a[] = {1,2,3,4,5};      //result should: {3,4,5,1,2}
		int n=3;
		
		for(int j=1;j<=3;j++)
		{
			int last = a[a.length-1];
			
			for(int i=a.length-1;i>0;i--)
			{
				a[i]= a[i-1];
			}
			a[0] = last;
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		//rotate an array to left by 3 elements
		
		
//				int a[] = {1,2,3,4,5}; 
//				int n=3;
//				
//				for(int j=1;j<=3;j++)
//				{
//					
//					int first = a[0];
//					
//					for(int i=0;i<a.length-1;i++)
//					{
//						a[i]=a[i+1];
//					}
//			        a[a.length-1] = first;	
//				}
//				System.out.println(Arrays.toString(a));


	}

}
