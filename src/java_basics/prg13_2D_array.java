package java_basics;

public class prg13_2D_array {

	public static void main(String[] args) 
	{
		//initialization
		int a[][] = new int[2][8];
		int [][]b = new int[2][2];
		int [][]c = {{1,2},{6,2}};
		int []y[] = new int[4][4];
		
		a[0][0] = 23;
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);  //by default 0
		System.out.println(a.length);   //will give number of rows
		System.out.println(a[1].length);  //will give number of columns in oth row(usually each row have same columns)
	}

}
