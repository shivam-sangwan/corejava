package String_programs;

public class prg3 {

	public static void main(String[] args) 
	{
		//replace: normally replace
		//replaceall:replace on the basis of regex
		
		//remove special characters from string
		String s = "This#string%containsspecial *characters&";
        String s1 = s.replaceAll("[^A-Za-z0-9\\s]", "");
        System.out.println(s1);
        
        //remove whitespaces from string
        String s2 = "Remove white spaces";
        System.out.println(s2.replace(" ", ""));
        
        //remove whitespaces without replace
//        String s7  = "Remove white spaces";
//        String s8 = "";
//        for(int i=0;i<s7.length();i++)
//        {
//        	if(s7.charAt(i)!=' ')
//        	{
//        	s8 =s8+ s7.charAt(i);
//        	}
//        	
//        }
//        System.out.println(s8);
//        
        
        
        
       
        
        //count occurances of a character in a string
        String s7  = "java programming";
        int count =0;
        for(int i=0;i<s7.length();i++)
        {
        	if(s7.charAt(i)=='a')
        	{
        	   count++;
        	}
        	
        }
        System.out.println(count);
        
        
        //count words in a string
        String b[] = s2.split(" ");
        int c=0;
        for(int i=0;i<b.length;i++)   //b.length will also give count of words
        {
        	c++;
        }
        System.out.println("words in string are " + c);
        
        
        //counting words without array
        String s6 = "welcome to java ";
        String s9 = s6.trim();
        int c1=1;
        for(int i=0;i<s9.length();i++) 
        {
        	if(s9.charAt(i)==' ')
        	{
        		c1++;
        	}
        }
        System.out.println("words in string are " + c1);
        
        //counting words without trim
        String s5 = "welcome to java ";
        int count1 =1;   //becoz one word(welcome) is already present before first space  
        for(int i=0;i<s5.length()-1;i++)
        {
        	if((s5.charAt(i)==' ') && (s5.charAt(i+1) != ' '))
        	{
        		count1++;
        	}
        }
        System.out.println("words in string are " + count1);
      
        
        
	}

}
