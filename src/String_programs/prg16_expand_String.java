package String_programs;

public class prg16_expand_String {

	public static void main(String[] args) {
		
		String s1 = "a2b3c2";
		String ex = "";
		char ch;
		int c = 0;
		for(int i=0;i<s1.length();i=i+2)
		{
			ch = s1.charAt(i);
			c = s1.charAt(i+1)-'0';  //converting char to int(subtraction gives int)
			
			while(c>0)
			{
				ex = ex + ch;
				c--;
			}
		}
		System.out.println(ex);

	}

}
