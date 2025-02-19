package array_imp_prg;

import java.util.Arrays;

public class prg11_arrays_equal {

	public static void main(String[] args) {
		int a[] = {20,10,24,14};
		int b[] = {20,10,24,14};
		System.out.println(Arrays.equals(a, b));
		
		//another method
		if(a.length != b.length)
		{
			System.out.println("not equal");
		}
		
		boolean flag = true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != b[i]) 
			{
				flag = false;
				break;
				
			}
		}
		if(flag ==true)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		

	}

}
