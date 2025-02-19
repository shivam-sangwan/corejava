package array_imp_prg;

public class Prg8_while_loop {

	public static void main(String[] args) 
	{
	    //while
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
		
		
		
		//for loop...print even number between 1 to 10
		System.out.println("switch");
		for(int i=1;i<=10;i++)
		{
			if(i%2 ==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("switch2");
		
		
		//while loop...print even number between 1 to 10
		int i=1;
		while(i<=10)
		{
			if(i%2 ==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		
		//naming 1 to 10 numbers as even/odd
		System.out.println("switch3");
		i=1;
		while(i<=10)
		{
			if(i%2 ==0)
			{
				System.out.println(i + " even");
			}
			else
			{
				System.out.println(i + " odd");
			}
			i++;
		}
		
		//descending while
		System.out.println("switch4");
		int j=10;
		while(j>=1)
		{
			System.out.println(j);
			j--; 
		}
		
		//while loop when number of itrations are not known.
		//reversing a number..number of digits are not known
		//checking if number is palindrom
		System.out.println("switch5");
		
		int num = 454,temp=num;
		int rev = 0,r;
		while(num>0)
		{
			r = num%10;
			rev = (rev*10) +r;
			num = num/10;	
		}
		System.out.println("reverse number is: " + rev);
         if(temp==rev)
         {
        	 System.out.println("number in palindrom");
         }
         
         
         //counting number of digits in a number
         int n = 2348;
         int count = 0;
         while(n>0)
         {
        	 
        	 n = n/10;
        	 count++;
         }
         System.out.println(count);
         
         
         System.out.println("switch7");
         //counting even and odd digits in a number
         int m = 234;
         int c1 = 0, c2=0,rm;
         while(m>0)
         {
        	 rm = m%10;
        	 if(rm%2==0)
        	 {
        		 c1++;
        	 }
        	 else
        	 {
        		 c2++; 
        	 }
        	 
        	 m = m/10;
         }
         System.out.println("odd " + c2 + " even " + c1);
         
         
        //sum of digits in a number
         n = 2348;
         int s=0;
         r=0;
         while(n>0)
         {
        	 
        	 r = n%10;
        	 s += r;
        	 n = n/10;
         }
         System.out.println(s);
	}

}
