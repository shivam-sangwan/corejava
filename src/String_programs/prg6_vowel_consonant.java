package String_programs;

public class prg6_vowel_consonant {

	public static void main(String[] args) {
		//count vowel consonant
		String s = "This is a really simple sEntence"; 
		String s1 = s.toLowerCase();
		int v=0,c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')  
			{
				v++;
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')  //otherwise spaces and spl characters will also counted.....we cane also use replaceall to solve this issue
			{
				c++;
			}
		}
		System.out.println("vowel: " + v + " consonant" + c);
		
		

	}

}
