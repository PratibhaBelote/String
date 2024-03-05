//Remove Specific
package String;

public class removeSpecific {

	public static void main(String[] args)
	{
		String a="absbcb";
		String c=" ";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!='b')
				c=c+a.charAt(i);
        }
		System.out.print(c);
	}

}
