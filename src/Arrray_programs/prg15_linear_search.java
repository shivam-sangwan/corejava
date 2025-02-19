package Arrray_programs;

public class prg15_linear_search {

	public static void main(String[] args)
	{
		//find if 100 is present in an array
		int a[] = {12,34,100,45,67};
		boolean status = false;  //int flag =0; concept not used bcoz int occupies more memory than boolean
		for(int b:a)
		{
			if(b==100)
			{
				status = true;
				break;
			}
			
		}
		if(status==false)
		{
			System.out.println("100 not present");
		}
		else
		{
			System.out.println("100 present");
		}

	}

}
