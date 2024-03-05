package String;

public class trimProgram {

	public static void main(String[] args) 
	{
		String s="            pratibha       belote              ";
		
		int startIndex=0;
		while(true)
		{
			if(s.charAt(startIndex)==' ')
				startIndex++;
			else
				break;
		}
		System.out.println(startIndex);
		
		int endIndex=s.length()-1;
		while(true)
		{
			if(s.charAt(endIndex)==' ')
				endIndex--;
			else
				break;
		}
		System.out.println(endIndex);
		for(int i=startIndex;i<=endIndex;i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
