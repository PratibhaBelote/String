package String;

public class frequency {

	public static void main(String[] args) 
	{
		String s="aabcdcd";
		//int max=Integer.MIN_VALUE;
		//char ch=0;
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				int freq=0;
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						freq++;
					}
				}
				System.out.println(s.charAt(i)+" "+freq);
			//	if(freq>max)
			//	{
			//		max=freq;
			//		ch=s.charAt(i);
			//	}
			}
		}
	//	System.out.println(ch+" "+max);

	}

}
