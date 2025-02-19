package array_imp_prg;

import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_Elements_Hashmap {

	public static void main(String[] args) {
		//count frequency of all elements of array
		
				int a[] = {1,1,2,2,3,4,4,5,1,7};
				Map<Integer,Integer> hm = new HashMap();
				for(int k:a)
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
			
				for(int k: hm.keySet())
				{
					System.out.println("number " + k + " frequency " + hm.get(k));
				}
					

	}

}
