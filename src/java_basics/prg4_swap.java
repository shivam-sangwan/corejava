package java_basics;

public class prg4_swap 
{
	public static void main(String args[])
    {      
		//swap 2 numbers
		
		//method 1
		int a=2,b=8;
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a + " and " + b);
		
		//method 2(without temp)
		a=10;b=18;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a + " and " + b);
		
		
		
		
    }
    
}
