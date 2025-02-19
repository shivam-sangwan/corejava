package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaration
		//List mylist = new ArrayList(); //method2..upcasting
		ArrayList mylist = new ArrayList(); //method1
		
		//storing homogeneous data with arraylist
		//ArrayList<String> mylist1 = new ArrayList(); //storing only strings
		//Arraylist<Employee> mylist = new ArrayList(); //storing only objects of employee class

		//adding data
		mylist.add(12);
		mylist.add("shiva");
		mylist.add(12);
		mylist.add(true);
		mylist.add(null);
		
		System.out.println(mylist.size());
		System.out.println(mylist);
		
		
		//removing data
		mylist.remove(3); //remove data from index 3..and shifts elements after 3rd index to left
		System.out.println(mylist);
		
		//inserting data in middle of list
		mylist.add(2, null);  //insert null at 2nd index
		System.out.println(mylist); //moves elements to right(includig 2nd index element)
		
		//replace data
		mylist.set(0, 144); //replace value at 0th index with 144
		System.out.println(mylist);
		
		//get element from list
		int j = (int) mylist.get(0); //downcasting from 'object' to 'integer
        String s = (String) mylist.get(1);
        System.out.println(j+ " " + s);
        System.out.println(j*2);
        System.out.println();
        
        
        //Reading elements from arraylist
        
        
        //method1: for loop
        for(int i=0;i<mylist.size();i++)
        {
        	System.out.println(mylist.get(i));
        }
        
        System.out.println();
        
        
        //method2: for each loop
        for(Object obj: mylist)
        {
        	System.out.println(obj);
        }
        
        //method3: using iterator: object used to iterate through elements of a collection(arraylist,hashset)
        //iterator can only be used with collection
        //used when we don't know the number of itrations i.e. how much data is present in arraylist
       
        
        System.out.println();
        Iterator it = mylist.iterator(); //iterator(): returns an iterator object
       //System.out.println(it.next());  //returns first element of arraylist
        while(it.hasNext()) //jab tak element h
        {
        	System.out.println(it.next());  //print that element
        }
        
        //iterating through list that contains only string objects
        //Iterator<String> it2 = mylist.iterator();...then use while loop
        
        //checking wheather arraylist is empty
        System.out.println(mylist.isEmpty());
        
        //remove multiple values from list at once
        System.out.println(mylist);
        ArrayList list2 = new ArrayList();
        list2.add(144);
        list2.add(null);
        list2.add(4);
        
        mylist.removeAll(list2); //all elements in of list2(which are present in mylist) will be removed from mylist
        
        
        
        
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        
        //removing all elements form list
        //mylist.removeAll(mylist);   //method1
        mylist.clear();               //method2 
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
	}
	
	

}
