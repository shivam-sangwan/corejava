package Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//key is integer and value is string
		HashMap<Integer, String> hm = new HashMap(); //can store only strings and integers
		
		HashMap hm3 = new HashMap();  //can store any data type
		hm3.put(12, 12);
		hm3.put(12, "sd");
		hm3.put("a", 12);
		
		
		
		
		
		
		Map<Integer, String> hm2 = new HashMap(); 
		
        //adding key and values
		hm.put(11, "ram");
		hm.put(12, "ravan");
		hm.put(12, "laxman"); //will replace ravan by laxman bcoz duplicate keys not allowed
		                      //hence put can also be used to chnage the value of a key
	    hm.put(13, "ram");
		
		System.out.println(hm);
		System.out.println(hm.size());  //will return number of pairs of hashmap
		
		//replacing value at key...can be also done using put
		hm.replace(12, "r");
		System.out.println(hm);
		
		
		
		
		//remove key
		hm.remove(11);  //removing key will remove that pair
		System.out.println(hm);
		
		//get value of a key
		System.out.println(hm.get(12));
		
		//get all keys and values from hashmap
		System.out.println(hm.keySet());     //return keys in form of hashset/set
		System.out.println(hm.values());    //return values in form of hashset/set
		System.out.println(hm.entrySet());  //return keys and  values in form of hashset/set
	    
		Set s = hm.entrySet();
		System.out.println(s);
		
		
		//reading values from hash map
		//we can read data from hashmap using for each loop or iterator
		//however iterator will increase complexity so not advisable
	    //normal for loop cannot be used to read data bcoz hashmap does not support index concept
		
		System.out.println();
		for(int k:hm.keySet())
		{
			System.out.println("key " + k + ", value " + hm.get(k));
		}
		hm.clear();
		System.out.println(hm);
		
	
		
	}
	
	
	

}
