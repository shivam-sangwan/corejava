package java_basics;

public class Prg6_if_else {

	public static void main(String[] args) {
		
		// normal if
		int age = 23;
		
		if(age >18)  //age>18 will return bolean expression..switch case cannot work on boolean expressions
		{
			System.out.println("eligible to vote");
		}
		
		//normal if else..even odd number
		int num=10;
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		
		//if else ladder...check id number is +ve,-ve or 0
		int n = -23;
		if(n<0)
		{
			System.out.println("negative");
		}
		else if(n>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("zero");
		}
		
		
		//if else ladder...find largest of 3 numbers
		int p = 2,q=4,r=8;
		if(p>q && p>r)
		{
			System.out.println("p is largest");
		}
		else if(q>p && q>r)
		{
			System.out.println("q is largest");
		}
		else
		{
			System.out.println("r is largest");
		}
		
		
		//nested if
		if(true)
		{
			if(false)
			{
				System.out.println("shivam");
			}
			else
			{
				System.out.println("sangwan");
			}
		}
		else
		{
			System.out.println("error");
		}

	}

}
