package Arrray_programs;

public class prg7_not_imp_missing_numbers {

	public static void main(String[] args) {
		//find missing numbers in array
				int c[] = {2,4,5,1,7};
				boolean p = false;
				for(int i=1;i<=7;i++)  //if hardcoding of 5&1 not allowed..find largest&smallest first
				{
					
					for(int j=0;j<c.length;j++)
					{
						if(i==c[j])
						{
							p =true;
							break;
						}
					}
					if(p==false)
					{
						System.out.println(i + " ");	
					}
					p =false;
				}

	}

}
