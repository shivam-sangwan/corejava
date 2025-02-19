package Arrray_programs;

public class prg28_not_imp_frequency_of_number {

	public static void main(String[] args) {
		int a[] = {1,1,2,2,3,4,4,5,1};
		int c=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==-1)
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] ==a[i])
				{
					a[j] = -1;
					c++;
				}
			}
			System.out.println(a[i] + " " + c);
			c=1;
	}
	}
}
