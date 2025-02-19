package array_imp_prg;

import java.util.Arrays;

public class prg6_merge_two_array {

	public static void main(String[] args) 
	        {
		//merge two array into single sorted array
		int a[] = {1,3,5,7};
		int b[] = {2,4,6,8};
		int t = 0;
		
		int m[] = new int[a.length + b.length];  
		
		for(int i=0;i<a.length;i++)
		{
		  m[t] = a[i];
		  t++;
		  
	    }
		
	
		for(int i=0;i<b.length;i++)
		{
		  m[t] = b[i];
		  t++;
	    }
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		
		
		
		
		//merge two array into single array using arraycopy..then sort array
//		int a[] = {1,3,5,7};
//		int b[] = {2,4,6,8};
//		
//		int m[] = new int[a.length + b.length];
//		
//		System.arraycopy(a, 0, m, 0, a.length);
//		System.arraycopy(b, 0, m, a.length, b.length);
//		System.out.println(Arrays.toString(m));
//		
//		Arrays.sort(m);
//		System.out.println("after sort: " + Arrays.toString(m));
		
		
	
		
			}

}
