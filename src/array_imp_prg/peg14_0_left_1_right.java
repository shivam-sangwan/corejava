package array_imp_prg;

import java.util.Arrays;

public class peg14_0_left_1_right {

	public static void main(String[] args) {
		//shift all zeros to left and ones to right
		
		int a[] = {1,1,0,0,1};
		
		//method 1: selection sort
		
		//method 2
		int c=0;
		for(int e:a)
		{
			if(e==0)
			{
				c++;
			}
		}
		for(int i=0;i<c;i++)
		{
			a[i] = 0;
		}
		
		for(int i=c;i<a.length;i++)
		{
			a[i]=1;
		}
		System.out.println(Arrays.toString(a));

	}

}
