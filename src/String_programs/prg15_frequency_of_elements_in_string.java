package String_programs;

import java.util.HashMap;
import java.util.Map;

public class prg15_frequency_of_elements_in_string {

	public static void main(String[] args) {
		
		String s1 = "shivamsangwan";
		char a[] = s1.toCharArray();
		
		Map<Character,Integer> hm = new HashMap();
		for(char k:a)
		{
			if(hm.containsKey(k))
			{
				hm.put(k,hm.get(k)+1); 
			}
			else
			{
				hm.put(k, 1);
			}
		}
	
		
		//frequency of elements
//		for(char k: hm.keySet())
//		{
//			System.out.println("character " + k + " frequency " + hm.get(k));
//		}
		
		//print duplicate elements of string
		for(char k: hm.keySet())
		{
			if(hm.get(k)>1)
			{
			  System.out.print(k);
			}
			
		}

	}

}
