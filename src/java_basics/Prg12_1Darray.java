                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 package java_basics;

public class Prg12_1Darray {

	public static void main(String[] args) 
	{
		int a[] = new int[5];  
		int []x = new int[6];
		
		
		a[0] = 4;
		a[4] = 7;  // if no value is assigned to a[2] then it will have 0 as default value
		System.out.println(a[2]);
		
		
		int l = a.length;
		System.out.println(l);
		
		
		
		
		int b[] = {4,8,5};    
		System.out.println(b[2]);
		
		System.out.println("switch");
		
		//traversing through array..for each loop(enhanced for loop)
		for(int c: a)
		{
			System.out.println(c);
		}
		
		//normal for loop
		System.out.println("switch2");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		//empty array
		int d[] = {};
		System.out.println(d.length);
		
		//object class: parent class of every class in java
		//every data type is subtype/subclass of object data type/class
		int h=5;
		String s1 = "abc";
		
		Object a1 = 5;
		Object s2 = "abc";
		
		//traversing throgh array
		Object m[] = {1,"abc"};   //storing hetrogeneous elements in array
		
		System.out.println("switch4");
		for(Object g:m)
		{
			System.out.println(g);
		}
		
	}

}
