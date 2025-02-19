package String_programs;

public class prg13_swap_two_strings {

	public static void main(String[] args) {
		//swap two strings without using 3rd variable
		String s1 = "hello";
		String s2 = "ram";
		s1 = s1.concat(s2);
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
