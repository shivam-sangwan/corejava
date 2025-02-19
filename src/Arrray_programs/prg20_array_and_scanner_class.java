package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class prg20_array_and_scanner_class {

	public static void main(String[] args)
	{
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter value at: " + i);
			a[i] = sc.nextInt();
		}
		 System.out.println("values are: " + Arrays.toString(a));
		 
		
		

	}

}
