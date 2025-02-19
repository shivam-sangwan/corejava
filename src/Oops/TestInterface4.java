package Oops;



interface Drawable{  
	
void draw(); 

static int square(int x)
{
	return x*x;
	
}  

default int cube(int x)
{
	return x*x*x;
	
} 

}  


class Rectangle implements Drawable{  
	
public void draw()
{
	System.out.println("drawing rectangle");
	
}  

}  
  
class TestInterface4{  
	
public static void main(String args[])
{  
	
Rectangle d=new Rectangle();  
d.draw(); 
System.out.println(Drawable.square(3));  //calling static method
System.out.println(d.cube(3));           //calling default method
}
}  