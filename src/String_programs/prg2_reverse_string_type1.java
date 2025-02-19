package String_programs;

public class prg2_reverse_string_type1 {

	public static void main(String[] args) {
		//reverse words position as well reverse each word
		
		
		//reverse a string and check for palindrom
		String s = "welcome to india";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
		  rev = rev + s.charAt(i);
	
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
		
		
		
		
		
		
		
		//USING STRINGBUILDER
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb.reverse());

		//using stringbuffer
		StringBuffer sbd = new StringBuffer("xyz");
		System.out.println(sbd.reverse());
	}

}
