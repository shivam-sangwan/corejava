package Oops;



public class TryCatchExample10 {  
  
	public int divideNum(int m, int n) 
	{  
        int div = m / n;  
        return div;  
    }  
	
    //main method  
    public static void main(String[] args) 
    {  
    	TryCatchExample10 obj = new TryCatchExample10();  
        try {  
            System.out.println(obj.divideNum(45, 0));  
        }  
        catch (ArithmeticException e)
        {  
            System.out.println("Number cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code");  
    }
	  }      
