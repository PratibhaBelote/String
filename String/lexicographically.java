package String;

public class lexicographically {

	public static void main(String[] args) 
	{
		String s1="Pratibha";
		String s2="PraTibha";
		
		int ans=s1.compareTo(s2);
		int ans1=s1.compareToIgnoreCase(s2);
		System.out.println(ans);
		System.out.println(ans1);

	}

}
