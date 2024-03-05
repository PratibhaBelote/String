package String;

public class endWith {

	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="def";
		
		if(s1.length()<s2.length())
		{
			System.out.println(false);
		}
		else
		{
			int s1Index=s1.length()-1;
			int s2Index=s2.length()-1;
			int cnt=0;
			while(s2Index>=0)
			{
				if(s1.charAt(s1Index)==s2.charAt(s2Index))
				{
					cnt++;
					s1Index--;
					s2Index--;
				}
				else
				{
					break;
					                                                           
				}
			}
			if(cnt == s2.length())
			{
                System.out.println(true); 
            } 
			else 
			{
                System.out.println(false); 
            }
		}

	}

}
