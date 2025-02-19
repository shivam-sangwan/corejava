package String_programs;

public class prg4 {

	public static void main(String[] args) {
		//count total characters excluding white spaces
		String s = "The best of both worlds";
		String s1 = s.replace(" ", "");
		System.out.println(s1.length());
		
		
		//above without replace
       int c1=0;
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)!=' ')
    	   {
    		   c1++;
    	   }
       }
       System.out.println(c1);
	}


	}
