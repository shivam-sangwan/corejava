package String_programs;

public class prg9_pangram {

	public static void main(String[] args) {
		//a string is pangram if it contains all the alphabets from a to z
		String s1 = "The quick brown fox jumps over the lazy dog";
		String s = s1.toLowerCase();
		boolean a[] = new boolean[26];
		boolean flag = true;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				a[s.charAt(i)-'a'] = true;   //mark all positions of a[] as true			
			}
		}
		for(boolean b:a)
		{
			if(b==false)
			{
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		}
		

	}

}
