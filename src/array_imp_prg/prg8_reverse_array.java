package array_imp_prg;

import java.util.Arrays;

public class prg8_reverse_array {

	public static void main(String[] args) 
	{
		
		//printing elements of array in reverse order
		int a[] = {3,5,2,8};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		//reverse an array
//		int a[] = {3,5,2,8};
//		int rev[] = new int[a.length];
//	    int j=0;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			rev[j] = a[i];
//			j++;
//		}
//		System.out.println(Arrays.toString(rev));

//Javascript: reverse array
let a = [2,3,8,6,1];
let rev = new Array(a.length);
let k=0;

for(let i=a.length-1;i>=0;i--)
{
  rev[k]=a[i];
  k++;
}
console.log(rev)      
		
		
		
	}

}
