package Oops;

class Animal
{
	void move()
	{
		System.out.println("animal is moving");
	}
	
	void eat() 
	{
		System.out.println("animal is eating");
	}
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("dog eating meat");
	}
	
	void bark()
	{
		System.out.println("dog is barking");
	}
}

class Test_upcasting_downcasting{  
	  
	  public static void main(String args[])
	  {  
	    Animal animal = new Dog();  //upcasting
	    animal.eat();
	    Dog dog = (Dog)animal;  //downcasting
	    dog.bark();
	    
	    
	 }  
	}  