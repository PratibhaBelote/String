//Remove Duplicate
package String;

public class dublicate {

	public static void main(String[] args)
	{			
				String a="dfghjd";
				String b="";
				
				for(int i=0;i<a.length();i++)
				{
					int cnt=0;
					for(int j=0;j<i;j++)
					{
						if(a.charAt(i)==a.charAt(j))
							cnt++;
					}
					if(cnt==0)
					{
						b=b+a.charAt(i);
				     
					}
				}
				 System.out.print(b);
	}

}