//string sequence
package String;

public class sortNumber {

	public static void main(String[] args) 
	{
		String s="43521";
		char[] ca=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ca[i]>ca[j])
				{
					char temp=ca[i];
					ca[i]=ca[j];
					ca[j]=temp;
				}
			}
		}
		String s2=new String(ca);
				System.out.println(s2);
	}

}
