package array_imp_prg;

import java.util.Arrays;

public class prg4_remove_duplicate_from_sorted_array {

	public static void main(String[] args)
	   {
		//remove duplicates from a sorted array
//		int a[] = {1,1,2,2,3,4,4,5};
//		int b[] = new int[a.length];
//		int j=0;
//		
//		for(int i=0;i<a.length-1;i++)
//	    {
//	       if(a[i] != a[i+1])  //to take unique elements
//	       {
//	    	   b[j] = a[i];
//	    	   j++;
//	       }
//	    }
//		b[j] = a[a.length-1];
//		
//		
//		for(int i=0;i<=j;i++)
//		{
//			System.out.println(b[i]);
//		}
		
  
		

		
		
		//check if an array contains duplicate
		int a[] = {1,6,2,5,3,6,1,4,5};
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					flag = true;
					break;
				}
				
			}
		}
		if(flag==true)
		{
			System.out.println("duplicate present");
		}
		else
		{
			System.out.println("duplicate not present");
		}
		
	}
		
}
