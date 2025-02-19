package array_imp_prg;


public class prg5Leapyear {

	public static void main(String[] args)
	{
		 int m = 1900;
	       
	     /*
	      * a number is leap year if:
	      * 1. it is divisible by 4 but not 100(for non century year)
	      * 2. it is divisible by 400(for century year)
	      */
    	 if((m%4 == 0 && m%100 != 0) || (m%400==0))
    	 {
    	    System.out.println("leap");
    	 }
    	 else
         {
        	 System.out.println("noleap"); 
        	 
         }

	}

}
