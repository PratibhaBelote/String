package String;

public class printDubilcate {

	public static void main(String[] args) 
	{
		String s1="csgcchjchydscmcjucwa";
		int unicele=0;
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i+1;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
				s=s+s1.charAt(i);
				unicele++;
			}
		}
		System.out.println(unicele);
		System.out.println(s);

	}

}
