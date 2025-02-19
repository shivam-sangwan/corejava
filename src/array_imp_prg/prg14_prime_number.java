package array_imp_prg;

public class prg14_prime_number {

	public static void main(String[] args) {
		int n = 97,count=0;
		for(int i=1;i<=n;i++)
		{
		  if(n%i==0)
		  {
			  count++;  //prime number has exact 2 factorials
		  }
		}
		if(count==2)
		{
			System.out.println("prime");
			
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
