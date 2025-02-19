package Arrray_programs;

import java.util.Arrays; //package required to use Arrays class

public class prg17_sorting_using_function {

	public static void main(String[] args)
	{
		
		//sorting int array
		int a[] = {20,10,24,14};
		String s = Arrays.toString(a); 
		//convert array to string form..used to print elements of array without using loop
		System.out.println("before sorting " + s);
		Arrays.sort(a); //sorts array in asc order
	    System.out.println("after sorting " + Arrays.toString(a));
	    
	    //sorting char array
	    char ch[] = {'e','a','r'};
	    Arrays.sort(ch);
	    System.out.println("after sorting " + Arrays.toString(ch));
	    
	    //sorting string array..arrange in dictionary
	    String s3[] = {"gy","ga","gha"};
	    Arrays.sort(s3);
	    System.out.println("after sorting " + Arrays.toString(s3));

	}

}
