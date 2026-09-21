package String_programs;

public class prg8_reverse_each_word {

	public static void main(String[] args) {
		//reverse words of string
		String s = "This is a really simple sEntence"; 
		String a[] = s.split(" ");
		String s1 = "",s2= "";
		for(String w: a)
		{
			for(int j=w.length()-1;j>=0;j--)
			{
				s2 = s2 + w.charAt(j);
			}
			s1 = s1 + s2 + " ";
			s2 ="";
		}
		System.out.println(s1);

	}

}

        //javascript
        let s1 = "This is a really simple sentence"; 
		let a = s1.split(" ");
		let s2 = "",s3= "";
		for(let w of a)
		{
			for(let j=w.length-1;j>=0;j--)
			{
				s2 = s2 + w[j];
			}
			s3 = s3 + s2 + " ";
			s2 ="";
		}
		console.log(s3);
