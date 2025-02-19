package java_basics;

public class prg3_ternaryoperator 
{
	public static void main(String[] args)
	{ 
		
	//find largest of two numbers
	int a=10,b=6; 
	int l = (a>b)?a:b;
	System.out.println("Largest number is: " + l);
	
	
	//check for leap year
	int m =2025;
	String s1 = (m%4==0 && m%100 != 0)|| (m%400==0)? "leap year": "no leap year";
	System.out.println(s1);
	
	
	
	}
}
