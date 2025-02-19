package array_imp_prg;

import java.util.Arrays;

public class prg2_bubble_sort {

	public static void main(String[] args) {
		//bubble sort ascending
		//compare adjacent elements and move larger element to i+1 location
		//repeat through for loop till largest element is in last
		
		int a[] = {50,20,40,10,100};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)  
			{
				if(a[j]>a[j+1])    //just replace > with < for desc
				{
					a[j] = a[j]+a[j+1];
					a[j+1] = a[j]-a[j+1];
					a[j] = a[j]-a[j+1];
				} 
			}
		}
		System.out.println(Arrays.toString(a));
		
		

	}

}
