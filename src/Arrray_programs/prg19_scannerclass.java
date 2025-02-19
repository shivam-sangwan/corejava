package Arrray_programs;
import java.util.Scanner;

public class prg19_scannerclass {

	public static void main(String[] args) 
	{
		//taking input from console
		//note: type input in console after running program
		
		System.out.println("enter a number");  //cannot take decimal input
		Scanner sc = new Scanner(System.in); //system.in takes input from system/console
		int num = sc.nextInt();     //type of input should be integer
		System.out.println(num+10);
		
		
		System.out.println("enter decimal number"); //will also take integer input(will convert it to decimal)
		double num2 = sc.nextDouble();   //type of input should be decimal
		System.out.println(num2+1);
		
		
		System.out.println("enter city");
		String s = sc.next();      //takes any input(%,2 etc.) as string input
		System.out.println("city is " + s);
		

	}

}
