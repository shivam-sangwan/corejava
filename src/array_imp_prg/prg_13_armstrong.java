package array_imp_prg;

public class prg_13_armstrong {

	public static void main(String[] args) {
		int number =153,n = number;
	      int r =0,sum=0;
	      while(n>0)
	      {
	        r = n%10;
	        sum = sum + r*r*r;
	        n= n/10;
	      }
	      System.out.println(sum);
	      if(sum==number)
	      {
	       System.out.print("number is armstrong");
	      }
	      else{
	        System.out.print("number is not armstrong");
	      }

	}

}
