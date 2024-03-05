package String;

public class lowerUpperCase {

	public static void main(String[] args)
	{
		// first method
		
		String s1="abcDEF";
		
		String s2=s1.toLowerCase();
		System.out.println(s2);
		
		
		//Second method
		
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(ch>='A' && ch<='Z')
				s3=s3+ch;
			else
				s3=s3+(char)(ch-32);
		}
		System.out.println(s3);
	}

}
