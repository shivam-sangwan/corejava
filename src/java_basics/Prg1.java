package java_basics;

public class Prg1 
{
    public static void main(String args[])
    {         
    	
    	int a=43,b=6;
    		
    	System.out.println(a/b);  //return quotient
    	System.out.println(a%b);  //return remainder
    	
    	System.out.println(a==b);
    	System.out.println(a!=b);
    	System.out.println(a>=b);
    	
    	System.out.println(!(a>b));
    	boolean sh = true; //used to set status of something based on a condition
    	System.out.println("sh"); //will be taken as string
    	System.out.println(sh);
    	
    	a++;  //means a = a+1
    	System.out.println(a);
        a--;
        System.out.println(a);
        
        int c=41;
        System.out.println(c+=5);
        c *= 10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);
        
        
        long z= 15666666666l;
        
        float r= (int)1.2;
        System.out.println(r);
        
        
       
      
        
        
    	
    } 
}
