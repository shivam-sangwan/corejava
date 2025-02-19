package String_programs;

public class prg5_count_special_character {

	public static void main(String[] args) 
	{
		//count all special characters in string
		String s = "He said, 'The mailman loves you.' I heard it with my own ears."; 
		
		//replace all special charecters with &
		String s1 = s.replaceAll("[^A-Za-z0-9\\s]", "&");  //   "\\s" represents space
		
		//count all &
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='&')
			{
				c++;
			}
		}
		System.out.println(c);
		
		//remove all special characters without using replaceall
//		String s2 = "He said, 'The mailman loves you.' I heard it with my own ears.";
//		String s4 ="";
//		for(int i=0;i<s2.length();i++)
//		{
//			if((s2.charAt(i)>='a' && s2.charAt(i)<='z') || (s2.charAt(i)>='A' && s2.charAt(i)<='Z') || s2.charAt(i)==' ')
//			{
//				s4 = s4+ s2.charAt(i);
//			}
//		}
//		System.out.println(s4);
		
		
		//count all special characters without using replaceall
		String s2 = "He said, 'The mailman loves you.' I heard it with my own ears.";
		int c1=0;
		for(int i=0;i<s2.length();i++)
		{
			if((s2.charAt(i)>='a' && s2.charAt(i)<='z') || (s2.charAt(i)>='A' && s2.charAt(i)<='Z') || s2.charAt(i)==' ')
			{
				continue;
			}
			c1++;
		}
		System.out.println(c1);

	}

}
