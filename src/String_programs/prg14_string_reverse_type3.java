package String_programs;

import java.util.Arrays;

public class prg14_string_reverse_type3 {

	public static void main(String[] args) {
		//input: this is shivam
		//output: shivam is this
		
		String s1 = "this is shivam";
		String a[] = s1.split(" ");
		String s2 ="";
		for(int i=a.length-1;i>=0;i--)
		{
			s2 = s2+a[i] + " ";
		}
        System.out.println(s2);
        
        //reverse keeping space intact
        //input: welcome to cloudtech
        //output: hcetduo lc otemoclew
        String s = "welcome to cloudtech";
        char[] b = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i) == ' ')
        	{
        		b[i]=s.charAt(i);
        	}
        }
        String ss = s.replace(" ", "");
        int j = ss.length()-1;
        for(int i=j;i>=0;i--)
        {
        	if(b[j-i]==' ')
        	{
        		b[j-i+1] = ss.charAt(i); 
        		continue;
        	}
        	b[j-i]=ss.charAt(i);
        }
        System.out.println(String.valueOf(b));
	}

}
