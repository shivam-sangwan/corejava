package java_basics;

public class prg7_switchcase {

	public static void main(String[] args) 
	{
		 
		//refer javapoint examples also
		
		//weekday using if else..inefficient way..will consume more lines of code
		int Weekday =2;
		if(Weekday==1)
		{
			System.out.println("sunday");
		}
		else if(Weekday==2)
		{
			System.out.println("monday");
		}
		else
		{
		 System.out.println("invalid day");
		}
		
		
		System.out.println("switch");
		
		//weekday using switch
		int weekday =2; 
		switch(weekday)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			 break;
		default:
				System.out.println("invalid day");
			
		}
		
		
		//switch case and string
		System.out.println("switch");
		
		String w = "sunday";
		switch(w)
		{
		case "sunday":
			System.out.println(1);
		case "monday":
		     System.out.println(2);
		     break;
		default:
			 System.out.println("invalid day");	 
		}
		

	}

}
