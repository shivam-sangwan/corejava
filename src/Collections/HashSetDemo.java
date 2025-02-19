package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration..3 methods
		HashSet myset = new HashSet();
		Set myset2 = new HashSet(); //upcasting
		HashSet<String> myset3 = new HashSet();
		
		//adding data
		myset.add(12);
		myset.add(142);
		myset.add("shiv");
		myset.add(12);
		myset.add(null);
		myset.add(null);
		myset.add(true);
		
		System.out.println(myset); //duplicates not added..order not preserved
		System.out.println(myset.size());
		
		
		//remove data
		myset.remove(12);   //in list index used to be given as parameter
		myset.remove(null);  //here obj itself is given as parameter(no concept of index)
		System.out.println(myset);
		
	    
		//we cannot replace data in hashset
		//we cannot access specific elements from hashset unlike arraylist
		//for above we can convert hashset to arraylist..or we can use for loop
		ArrayList list = new ArrayList(myset);
		System.out.println(list);
		System.out.println(list.get(0));
		
        //we can read data from hashset using for each loop or iterator
       //normal for loop cannot be used to read data bcoz hashset does not support index concept
	    
		
		//removing multiple values from hashset
		System.out.println();
		System.out.println(myset);
		
		HashSet set2 = new HashSet();
		set2.add("shiv");
		set2.add(142);
		myset.removeAll(set2);
		
		
		 //removing all elements form hashset
		//myset.removeAll(myset);
		System.out.println();
	    System.out.println(myset);
	    System.out.println(myset.isEmpty());
	    myset.clear();
	    System.out.println(myset.isEmpty());
	
	}

}
