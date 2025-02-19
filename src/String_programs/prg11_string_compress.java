package String_programs;

public class prg11_string_compress {

	public static void main(String[] args) {
		//compress a string with consecutive characters
        //input: aabcccccaaa   output: a2b1c5a3
		
		String s = "aabcccccaaa";
		String com = "";
		int count =1;
		for(int i=0;i<s.length();i++)  //ager hum yhaan s.length()-1 krte to wo last element kr liye loop m hi nhi jata
		{                             //..i+1<s.length() se wo loop m else block m gya..or last element wali prob solve ho gyi
			
				if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) //&& only checks first condition
				{
					count++;
				}
				else
				{
					com = com+s.charAt(i)+count;
					count =1;
				}
			
			
		}
		System.out.println(com);
		
		
	}

}
