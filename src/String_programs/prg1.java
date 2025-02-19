package String_programs;

import java.util.Arrays;

public class prg1 {

	public static void main(String[] args) {
		// string methods
         
		String s = "welcome";
		
		//length
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concatination
		String s2 = "here";
		System.out.println(s+s2);  
		System.out.println(s2.concat(s));
		System.out.println(s);
		System.out.println(s2);
		
		String s3 = "bro";
		System.out.println(s.concat(s2).concat(s3));
		System.out.println(s.concat(s2+s3));
		
		//trim: remove spaces from both side of string
		 String s4 = " shiv ";
		 System.out.println(s4.length());
		 System.out.println(s4.trim().length());
		 System.out.println(s4.length());
		 
		 String s5 = s4.trim();
		 System.out.println(s5.length());
		 
		 
		 //charAt(): return chacter at given index of string
		 System.out.println(s3.charAt(1));
		 System.out.println(s3.indexOf('r'));
		 
		 
		 //contains: check if a string is part of another string
		 String s6 = "ramraj";
		 String s7 = "raj";
		 System.out.println(s6.contains("mra"));
		 System.out.println(s6.contains(s7));
		 
		 
		 //comparing string
		 String s8 = "Ramraj";
		 System.out.println(s6.equals(s8));           //casesensitive
		 System.out.println(s6.equalsIgnoreCase(s8)); //not case sensitive
		 
		 //replace
		 System.out.println(s8.replace('a', 'f'));  //replace characters
		 System.out.println(s8.replace("mr", "s"));  //replace strings
		 
		 //substring
		 System.out.println(s8.substring(2));   
		 System.out.println(s8.substring(2, 5)); //return string from index 2 to 4(5-1)
		 
		 String s9 = "aadccRccca"; //replace all a and c with x and respectevely
		 System.out.println(s9.replace('a', 'x').replace('c','y'));
		 
		 System.out.println(s9.toUpperCase());
		 System.out.println(s9.toLowerCase());
		 
		 //split: splits 1 string into 2 based on given character
		 String s10 = "shivam%sangwan";
		 String a[] = s10.split("%");
		 System.out.println(Arrays.toString(a));
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 
		 String b[] = s10.split("v");
		 System.out.println(b[0]);
		 System.out.println(b[1]);
		 
		String s11 = "12,23,56";
		String ar[] = s11.split(",");
		System.out.println(Arrays.toString(ar)); //now we can perform any oprn on array objects
		
		String s12 = "$12,23,56";
		System.out.println(s12.replace("$", "").replace(",", ""));
		
		String s13 = "abc 123 xyz";
		String arr[] = s13.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		String s14 = "John kenedy"; //check if it contains john (j lowercase)
		System.out.println(s14.contains("john"));
		System.out.println(s14.toLowerCase().contains("john"));
		
		//valueof(): convert any data type to string
		int g = 12;
		String s15 = String.valueOf(g);
		System.out.println(s15);
		
		//converting string to int
		int h = Integer.parseInt(s15);
		System.out.println(h+2);
		
		//converting string to double
		double h1 = Double.parseDouble(s15);
		System.out.println(h1+3);
		
		//converting string into array..another method is using split()
		String s16 = "asdf";
		char p[] = s16.toCharArray();
		System.out.println(Arrays.toString(p));
		
		//converting array to string
		int f[] = {1,2,3,};
		String d = Arrays.toString(f);
		System.out.println(d);
		String d2 = d.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(d2);
		
	} 
	

}
