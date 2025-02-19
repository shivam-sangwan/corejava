package array_imp_prg;

import java.util.Arrays;

public class prg3_pair_add_to_target {
	public static void main(String[] args) 
	{
		
		     //pair of numbers add to a target element
		int a[] = {1,2,5,4,7};
		int target = 9;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j] == target)
				{
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
				

}
}