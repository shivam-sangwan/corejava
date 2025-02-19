package Arrray_programs;

import java.util.Arrays;

public class prg6_not_imp_remove_duplicates {

	public static void main(String[] args) {
		//remove duplicates from an array
				int a[] = {1,1,2,2,3,4,4,5};
				int b[] = new int[a.length];
				int k=0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[j] ==a[i])
						{
							a[j] = -1;
						}
					}
				}
				//System.out.println(Arrays.toString(a));
				for(int i=0;i<a.length;i++)
				{
					if(a[i] !=-1)
					{
						b[k] = a[i];
						k++;
					}
				}
				for(int i=0;i<k;i++)
				{
					System.out.println(b[i]);
				}
				

	}

}
