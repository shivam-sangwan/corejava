package String_programs;

public class prg10_string_rotation {

	public static void main(String[] args) {
		//check if a string is rotation of other string
		String s1 = "waterbottle";   
		String s2 = "erbottlewat";
		
		s1 = s1+s1;
		if(s1.contains(s2))
		{
			System.out.println("rotation");
		}
		else
		{
			System.out.println("not rotation");
		}

	}

}
