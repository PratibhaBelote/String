package String;

public class palindrome {

	public static void main(String[] args) 
	{
		String s="123";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s.equals(s1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
