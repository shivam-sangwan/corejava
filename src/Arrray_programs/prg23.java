package Arrray_programs;

import java.util.Arrays;

public class prg23 {

	public static void main(String[] args) {
		//copying elements of array into another array
				int a[] = {1,6,2,5};
				int b[] = new int[a.length];
				for(int i=0;i<a.length;i++)
				{
					b[i] = a[i];
					
				}
				System.out.println(Arrays.toString(b));

	}

}
