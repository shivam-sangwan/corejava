package array_imp_prg;

import java.util.Arrays;

public class prg1_selection_sort 
{

	public static void main(String[] args) 
	{
		
		//compare first element with all other elements through loop
		//and replace if smaller element is found
		//better than bubble sort bcoz no unnecesary swaping
		
		//sorting in asc order
//	    int a[] = {50,20,40,10,100};
//	    int temp = 0;
//	    for(int i=0;i<a.length;i++)
//	    {
//	    	for(int j=i+1;j<a.length;j++)
//	    	{
//	    		if(a[j]<a[i])
//	    		{
//	    			temp = a[i];
//	    			a[i] = a[j];
//	    			a[j] = temp;  
//	    		}
//	    	}
//	    }
//	    System.out.println(Arrays.toString(a));
	    
	    
	  //sorting in asc order without temp
	    int a[] = {50,20,40,10,100};
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[j]<a[i])
	    		{
	    			a[i] = a[i]+a[j];
	    			a[j] = a[i]-a[j];
	    			a[i] = a[i]-a[j];
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(a));
	    
	    
	  //sorting in desc order
	    int b[] = {50,20,4,40,10,100};
	    for(int i=0;i<b.length;i++)
	    {
	    	for(int j=i+1;j<b.length;j++)
	    	{
	    		if(b[j]>b[i])
	    		{
	    			b[i] = b[i]+b[j];
	    			b[j] = b[i]-b[j];
	    			b[i] = b[i]-b[j];
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(b));
	    
	    //finding 3rd largest element
	    //solution: sort array in desc order and print a[2]
        System.out.println("third largest element: " + a[2]);
	}
	
}
