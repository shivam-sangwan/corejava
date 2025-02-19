package String_programs;

import java.util.Arrays;

public class prg7_anagram {

	public static void main(String[] args) {
		// anagram: two strings having same characters in diffrent order
		String st1="Brag";  
        String st2="Grab"; 
        
        
        if(st1.length() != st2.length())
        {
        	System.out.println("not anagram");
        }
        
        
        char a[] = st1.toLowerCase().toCharArray();
        char b[] = st2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b); //or sort using nested for loop
        
        
        
        boolean flag =true;
        for(int i=0;i<a.length;i++) 
        {
        	if(a[i] !=b[i])
        	{
        		flag =false;
        		break;
        	}
        }
        if(flag)  
        {
        	System.out.println("anagram");
        }
        else 
        {  
            System.out.println("Both the strings are not anagram");  
        }  
        
        
        
        
        
        
        
        
        
        
        //or use Arrays.equals
        if(Arrays.equals(a, b))  
        {
        	System.out.println("anagram");
        }
        else 
        {  
            System.out.println("Both the strings are not anagram");  
        }  
	}

}
