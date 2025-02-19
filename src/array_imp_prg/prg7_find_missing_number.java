package array_imp_prg;

public class prg7_find_missing_number {

	public static void main(String[] args) {
		
		
		
		//finding single missing number
		int c[] = {2,4,5,1};
		int n = 5; //total numbers should be
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        
        for(int i=0;i<c.length;i++)
        {
        	actualsum += c[i];
        }
        int missingnum = expectedsum -actualsum;
        System.out.println(missingnum);

	}

}
