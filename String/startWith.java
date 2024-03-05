package String;

public class startWith {

	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="";
		
		if(s1.length()<s2.length())
		{
			System.out.println("false");
		}
		else
		{
			int cnt=0;
			for(int i=0;i<s2.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
			}
			if(cnt==s2.length())
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}

	}

}
