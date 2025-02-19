package array_imp_prg;

public class prg10_even_odd_position {

	public static void main(String[] args) {
		// print even position elements of an array
//		int a[] = {1,6,2,5};
//		for(int i=0;i<a.length;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
		
		// print odd position elements of an array
				int b[] = {1,6,2,5};
				for(int i=0;i<b.length;i++)
				{
					if(i%2!=0)
					{
						System.out.println(b[i]);
					}
				}

	}

}
