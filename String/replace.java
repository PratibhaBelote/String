//Replace
package String;

public class replace {

	public static void main(String[] args) 
	{
		// first method using method
		
		String s="sdsdsdsdsdsdsd";
		
		String s1=s.replace('d', 'f');
		System.out.println(s1);
		
		
		
		
		//*second method*
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='d')
			{
				s2=s2+'f';
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
