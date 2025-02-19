package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_vs_collections {

	public static void main(String[] args) {

		List<String> mylist = new ArrayList();
		mylist.add("bbc");
		mylist.add("cbc");
		mylist.add("abc");
		
		System.out.println(mylist);
		
		//using collections class to sort mylist
		Collections.sort(mylist);
		System.out.println(mylist);
		

	}

}
