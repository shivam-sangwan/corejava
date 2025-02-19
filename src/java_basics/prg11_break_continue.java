package java_basics;

public class prg11_break_continue {

	public static void main(String[] args)
	{
		
		//break
		for(int i=1;i<=10;i++)
		{
			
			if(i ==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("switch");
		
		//continue
		for(int i=1;i<=10;i++)
		{
			
			if(i==5)
			{
				continue;
			} 
			System.out.println(i);
		}
	 
	}

}
