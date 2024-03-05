package String;

public class startEndWith {

	public static void main(String[] args) 
	{
		String s="ramsiyaram";
		String s1="ram";
		boolean startWith=s.startsWith(s1);
		System.out.println(startWith);
		boolean endWith=s.endsWith(s1);
		System.out.println(endWith);

	}

}
